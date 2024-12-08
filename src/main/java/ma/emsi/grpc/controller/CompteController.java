package ma.emsi.grpc.controller;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import ma.emsi.grpc.entities.Compte;
import ma.emsi.grpc.entities.TypeCompte;
import ma.emsi.grpc.repositories.CompteRepository;
import ma.emsi.grpc.stub.bank.Bank;
import ma.emsi.grpc.stub.bank.CompteServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@GrpcService
public class CompteController extends CompteServiceGrpc.CompteServiceImplBase {
    private final CompteRepository compteRepository;

    @Override
    public void getAllCompteswithtype(Bank.TypeCompte_req request, StreamObserver<Bank.FindAllResponse> responseObserver) {
        List<Compte> comptes = compteRepository.findByType(TypeCompte.valueOf(request.getType().name()));
        List<Bank.Compte> response = comptes.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
        Bank.FindAllResponse list = Bank.FindAllResponse.newBuilder()
                .addAllCompte(response)
                .build();
        responseObserver.onNext(list);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteCompte(Bank.DeleteCompteRequest request, StreamObserver<Bank.DeleteCompteResponse> responseObserver) {
        Long id = request.getId();
        if (compteRepository.existsById(id)) {
            compteRepository.deleteById(id);
            responseObserver.onNext(Bank.DeleteCompteResponse.newBuilder()
                    .setSuccess(true)
                    .build());
        } else {
            responseObserver.onNext(Bank.DeleteCompteResponse.newBuilder()
                    .setSuccess(false)
                    .build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void saveCompte(Bank.CompteRequest request, StreamObserver<Bank.Compte> responseObserver) {
        Compte compte = toEntity(request);
        Compte savedCompte = compteRepository.save(compte);
        responseObserver.onNext(toDto(savedCompte));
        responseObserver.onCompleted();
    }

    @Override
    public void getTotalSolde(Bank.Empty request, StreamObserver<Bank.SoldeStats> responseObserver) {
        long count = compteRepository.count();
        double sum = compteRepository.sumSoldes();
        double average = count > 0 ? sum / count : 0;

        Bank.SoldeStats stats = Bank.SoldeStats.newBuilder()
                .setCount((int) count)
                .setSum((float) sum)
                .setAverage((float) average)
                .build();

        responseObserver.onNext(stats);
        responseObserver.onCompleted();
    }

    @Override
    public void getCompteById(Bank.GetCompteByIdRequest request, StreamObserver<Bank.Compte> responseObserver) {
        Long id = request.getId();
        Optional<Compte> optionalCompte = compteRepository.findById(id);
        if (optionalCompte.isPresent()) {
            responseObserver.onNext(toDto(optionalCompte.get()));
        } else {
            responseObserver.onError(new RuntimeException(String.format("Compte %d not found", id)));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getAllComptes(Bank.Empty request, StreamObserver<Bank.FindAllResponse> responseObserver) {
            List<Compte> comptes = compteRepository.findAll();
            List<Bank.Compte> response = comptes.stream()
                    .map(this::toDto)
                    .collect(Collectors.toList());
            Bank.FindAllResponse list = Bank.FindAllResponse.newBuilder()
                    .addAllCompte(response)
                    .build();
            responseObserver.onNext(list);
            responseObserver.onCompleted();
    }

    public Compte toEntity(Bank.CompteRequest request) {
        return Compte.builder()
                .solde(request.getSolde())
                .dateCreation(new Date())
                .type(TypeCompte.valueOf(String.valueOf(request.getType())))
                .build();
    }
    public Bank.Compte toDto(Compte entity) {
        return Bank.Compte.newBuilder()
                .setSolde((float) entity.getSolde())
                .setType(Bank.TypeCompte.valueOf(entity.getType().toString()))
                .setDateCreation(entity.getDateCreation().toString())
                .setId(entity.getId())
                .build();
    }
}

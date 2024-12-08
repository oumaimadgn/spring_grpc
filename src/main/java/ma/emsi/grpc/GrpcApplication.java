package ma.emsi.grpc;

import ma.emsi.grpc.entities.Compte;
import ma.emsi.grpc.entities.TypeCompte;
import ma.emsi.grpc.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GrpcApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository) {
        return args -> {
            compteRepository.save(new Compte(null, 1100.0, new Date(2024 - 1900, 10, 5), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null, 2300.0, new Date(2024 - 1900, 11, 10), TypeCompte.COURANT));
            compteRepository.save(new Compte(null, 3400.0, new Date(2025 - 1900, 0, 15), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null, 4100.0, new Date(2025 - 1900, 1, 20), TypeCompte.COURANT));
            compteRepository.save(new Compte(null, 5200.0, new Date(2025 - 1900, 2, 25), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null, 6000.0, new Date(2025 - 1900, 3, 5), TypeCompte.COURANT));
            };
    }

}

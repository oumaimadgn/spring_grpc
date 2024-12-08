package ma.emsi.grpc.repositories;

import ma.emsi.grpc.entities.Compte;
import ma.emsi.grpc.entities.TypeCompte;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {


    @Query("SELECT SUM(c.solde) FROM Compte c")

    double sumSoldes();

    // Custom method to find comptes by type and minimum solde
    Page<Compte> findByTypeAndSoldeGreaterThanEqual(TypeCompte type, Double minSolde, Pageable pageable);
    List<Compte> findByTypeAndSoldeGreaterThanEqual(TypeCompte type, Double minSolde);

    Page<Compte> findByType(TypeCompte type, Pageable pageable);
    List<Compte> findByType(TypeCompte type);

}
package sn.ksi.boutique.gestion_boutique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ksi.boutique.gestion_boutique.model.Dette;
import sn.ksi.boutique.gestion_boutique.model.Paiement;

import java.util.List;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
    List<Paiement> findByDette(Dette dette);
}
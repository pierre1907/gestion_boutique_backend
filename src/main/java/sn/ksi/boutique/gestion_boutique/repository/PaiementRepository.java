package sn.ksi.boutique.gestion_boutique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ksi.boutique.gestion_boutique.model.Paiement;


@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
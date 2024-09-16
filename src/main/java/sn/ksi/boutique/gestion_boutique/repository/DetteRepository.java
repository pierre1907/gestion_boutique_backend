package sn.ksi.boutique.gestion_boutique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ksi.boutique.gestion_boutique.model.Client;
import sn.ksi.boutique.gestion_boutique.model.Dette;

import java.util.List;

@Repository
public interface DetteRepository extends JpaRepository<Dette, Long> {
    List<Dette> findByClientAndMontantGreaterThan(Client client, Double montant);
}
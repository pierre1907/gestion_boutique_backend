package sn.ksi.boutique.gestion_boutique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.ksi.boutique.gestion_boutique.model.Client;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByTelephone(String telephone);
    List<Client> findByCompteUtilisateurIsNotNull();
    List<Client> findByCompteUtilisateurIsNull();
}


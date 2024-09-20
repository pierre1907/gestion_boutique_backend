package sn.ksi.boutique.gestion_boutique.repository;

import sn.ksi.boutique.gestion_boutique.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByPhone(String phone);
    List<Client> findByEmailIsNotNull();
    List<Client> findByEmailIsNull();
}

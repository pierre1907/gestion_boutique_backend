

package sn.ksi.boutique.gestion_boutique.repository;

import sn.ksi.boutique.gestion_boutique.model.Dette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DetteRepository extends JpaRepository<Dette, Long> {
     List<Dette> findByClientAndIsPaidFalse(Long clientId);
}

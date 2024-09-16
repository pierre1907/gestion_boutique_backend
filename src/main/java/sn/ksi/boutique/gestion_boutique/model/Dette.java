package sn.ksi.boutique.gestion_boutique.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dette {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Double montant;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "dette", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Paiement> paiements;

}
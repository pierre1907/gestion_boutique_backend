package sn.ksi.boutique.gestion_boutique.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private double amount;
    private boolean isPaid;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}

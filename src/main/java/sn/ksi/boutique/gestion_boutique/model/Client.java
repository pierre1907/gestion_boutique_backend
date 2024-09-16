package sn.ksi.boutique.gestion_boutique.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;
    private String adresse;
    private String telephone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "compte_utilisateur_id", referencedColumnName = "id")
    private CompteUtilisateur compteUtilisateur;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dette> dettes;


}

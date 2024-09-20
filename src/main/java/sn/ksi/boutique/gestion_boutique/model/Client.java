package sn.ksi.boutique.gestion_boutique.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;
    private String phone;
    private String address;
    private String email;
    private String login;
    private String password;
    private String photo;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Dette> debts;
}

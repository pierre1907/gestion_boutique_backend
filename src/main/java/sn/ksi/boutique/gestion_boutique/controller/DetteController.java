package sn.ksi.boutique.gestion_boutique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ksi.boutique.gestion_boutique.model.Dette;
import sn.ksi.boutique.gestion_boutique.model.Client;
import sn.ksi.boutique.gestion_boutique.service.ClientService;
import sn.ksi.boutique.gestion_boutique.service.DetteService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/dettes")
public class DetteController {

    private final DetteService debtService;
    private final ClientService clientService;

    @Autowired
    public DetteController(DetteService debtService, ClientService clientService) {
        this.debtService = debtService;
        this.clientService = clientService;
    }

    // Créer une nouvelle dette pour un client
    @PostMapping("/{clientId}")
    public ResponseEntity<Dette> createDebt(@PathVariable Long clientId, @RequestBody Dette debt) {
        Optional<Client> clientOpt = clientService.getClientByPhone(clientId.toString());  // Utilisation du service Client pour récupérer le client
        if (clientOpt.isPresent()) {
            Client client = clientOpt.get();
            Dette createdDebt = debtService.createDebt(client, debt);
            return ResponseEntity.ok(createdDebt);
        }
        return ResponseEntity.notFound().build();
    }

    // Lister les dettes non soldées pour un client
    @GetMapping("/client/{clientId}/unpaid")
    public ResponseEntity<List<Dette>> getUnpaidDebtsForClient(@PathVariable Long clientId) {
        List<Dette> unpaidDebts = debtService.getUnpaidDebtsForClient(clientId);
        return ResponseEntity.ok(unpaidDebts);
    }
}
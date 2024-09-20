package sn.ksi.boutique.gestion_boutique.controller;

import sn.ksi.boutique.gestion_boutique.model.Client;
import sn.ksi.boutique.gestion_boutique.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.createClient(client));
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(clientService.getAllClients());
    }

    @GetMapping("/{phone}")
    public ResponseEntity<Optional<Client>> getClientByPhone(@PathVariable String phone) {
        return ResponseEntity.ok(clientService.getClientByPhone(phone));
    }
}

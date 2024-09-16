package sn.ksi.boutique.gestion_boutique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ksi.boutique.gestion_boutique.model.Paiement;
import sn.ksi.boutique.gestion_boutique.service.PaiementService;

@RestController
@RequestMapping("/api/paiements")
public class PaiementController {

    private final PaiementService paiementService;

    @Autowired
    public PaiementController(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    @PostMapping
    public ResponseEntity<Paiement> recordPayment(@RequestBody Paiement paiement) {
        return ResponseEntity.ok(paiementService.recordPayment(paiement));
    }
}
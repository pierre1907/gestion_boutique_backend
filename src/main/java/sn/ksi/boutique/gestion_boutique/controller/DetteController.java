package sn.ksi.boutique.gestion_boutique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ksi.boutique.gestion_boutique.model.Dette;
import sn.ksi.boutique.gestion_boutique.service.DetteService;

import java.util.List;

@RestController
@RequestMapping("/api/dettes")
public class DetteController {

    private final DetteService detteService;

    @Autowired
    public DetteController(DetteService detteService) {
        this.detteService = detteService;
    }

    @PostMapping
    public ResponseEntity<Dette> createDette(@RequestBody Dette dette) {
        return ResponseEntity.ok(detteService.createDette(dette));
    }

    @GetMapping("/non-settled/{clientId}")
    public ResponseEntity<List<Dette>> getNonSettledDebts(@PathVariable Long clientId) {
        List<Dette> dettes = detteService.getNonSettledDebts(clientId);
        return ResponseEntity.ok(dettes);
    }
}
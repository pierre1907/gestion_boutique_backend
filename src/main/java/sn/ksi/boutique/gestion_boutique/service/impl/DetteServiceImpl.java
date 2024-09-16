package sn.ksi.boutique.gestion_boutique.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ksi.boutique.gestion_boutique.model.Dette;
import sn.ksi.boutique.gestion_boutique.repository.DetteRepository;
import sn.ksi.boutique.gestion_boutique.service.DetteService;

import java.util.List;

@Service
public class DetteServiceImpl implements DetteService {

    private final DetteRepository detteRepository;

    @Autowired
    public DetteServiceImpl(DetteRepository detteRepository) {
        this.detteRepository = detteRepository;
    }

    @Override
    public Dette createDette(Dette dette) {
        return detteRepository.save(dette);
    }

    @Override
    public List<Dette> getNonSettledDebts(Long clientId) {
        // Implémente la logique pour récupérer les dettes non soldées
        return null;
    }
}

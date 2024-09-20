package sn.ksi.boutique.gestion_boutique.service.impl;

import sn.ksi.boutique.gestion_boutique.model.Client;
import sn.ksi.boutique.gestion_boutique.model.Dette;
import sn.ksi.boutique.gestion_boutique.repository.DetteRepository;
import sn.ksi.boutique.gestion_boutique.service.DetteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetteServiceImpl implements DetteService {

    @Autowired
    private DetteRepository detteRepository;

    @Override
    public Dette createDebt(Client client, Dette debt) {
        debt.setClient(client);
        return detteRepository.save(debt);
    }

    @Override
    public List<Dette> getUnpaidDebtsForClient(Long clientId) {
        return detteRepository.findByClientAndIsPaidFalse(clientId);
    }

    @Override
    public List<Dette> getAllDettes() {
        return detteRepository.findAll();
    }
}

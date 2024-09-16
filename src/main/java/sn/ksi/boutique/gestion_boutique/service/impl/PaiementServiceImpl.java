package sn.ksi.boutique.gestion_boutique.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ksi.boutique.gestion_boutique.model.Paiement;
import sn.ksi.boutique.gestion_boutique.repository.PaiementRepository;
import sn.ksi.boutique.gestion_boutique.service.PaiementService;

@Service
public class PaiementServiceImpl implements PaiementService {

    private final PaiementRepository paiementRepository;

    @Autowired
    public PaiementServiceImpl(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @Override
    public Paiement recordPayment(Paiement paiement) {
        return paiementRepository.save(paiement);
    }
}
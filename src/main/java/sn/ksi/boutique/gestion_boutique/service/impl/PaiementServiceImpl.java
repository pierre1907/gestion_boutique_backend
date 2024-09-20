package sn.ksi.boutique.gestion_boutique.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ksi.boutique.gestion_boutique.model.Paiement;
import sn.ksi.boutique.gestion_boutique.model.Dette;
import sn.ksi.boutique.gestion_boutique.repository.PaiementRepository;
import sn.ksi.boutique.gestion_boutique.service.PaiementService;

@Service
public class PaiementServiceImpl implements PaiementService {

    @Autowired
    private PaiementRepository paymentRepository;

    @Override
    public Paiement createPayment(Dette debt, Paiement payment) {
        payment.setDebt(debt);
        return paymentRepository.save(payment);
    }
}
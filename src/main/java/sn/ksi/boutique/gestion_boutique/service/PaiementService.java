package sn.ksi.boutique.gestion_boutique.service;


import sn.ksi.boutique.gestion_boutique.model.Paiement;
import sn.ksi.boutique.gestion_boutique.model.Dette;

public interface PaiementService {
    Paiement createPayment(Dette debt, Paiement payment);
}


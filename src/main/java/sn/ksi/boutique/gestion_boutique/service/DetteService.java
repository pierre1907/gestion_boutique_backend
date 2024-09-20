package sn.ksi.boutique.gestion_boutique.service;

import sn.ksi.boutique.gestion_boutique.model.Client;
import sn.ksi.boutique.gestion_boutique.model.Dette;

import java.util.List;

public interface DetteService {
    Dette createDebt(Client client, Dette debt);
    List<Dette> getUnpaidDebtsForClient(Long clientId);
    List<Dette> getAllDettes();

}

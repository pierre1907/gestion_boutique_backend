package sn.ksi.boutique.gestion_boutique.service;

import sn.ksi.boutique.gestion_boutique.model.Dette;

import java.util.List;

public interface DetteService {
    Dette createDette(Dette dette);
    List<Dette> getNonSettledDebts(Long clientId);
}

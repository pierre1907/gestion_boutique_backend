package sn.ksi.boutique.gestion_boutique.service;


import sn.ksi.boutique.gestion_boutique.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client createClient(Client client);
    List<Client> listAllClients(boolean withAccount);
    Optional<Client> getClientByTelephone(String telephone);
    void deleteClient(Long id);
}

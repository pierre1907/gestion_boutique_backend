package sn.ksi.boutique.gestion_boutique.service.impl;

import sn.ksi.boutique.gestion_boutique.model.Client;
import sn.ksi.boutique.gestion_boutique.repository.ClientRepository;
import sn.ksi.boutique.gestion_boutique.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getClientByPhone(String phone) {
        return clientRepository.findByPhone(phone);
    }

    @Override
    public List<Client> getClientsWithAccount() {
        return clientRepository.findByEmailIsNotNull();
    }

    @Override
    public List<Client> getClientsWithoutAccount() {
        return clientRepository.findByEmailIsNull();
    }
}

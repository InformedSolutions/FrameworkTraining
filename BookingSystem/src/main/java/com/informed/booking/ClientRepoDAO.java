package com.informed.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ClientRepoDAO {

    @Autowired
    private ClientRepository repo;

    public List<Client> getAllProviders() {
        System.out.println("BookingSystem.getClient");
        Iterable<Client> iterable = repo.findAll();
        List<Client> clients = new ArrayList<Client>();
        for (Client b : iterable) {
            clients.add(b);
        }
        return clients;
    }

    public void saveClient(Client client) {
        System.out.println("BookingSystem.saveClient(" + client + ")");
        repo.save(client);
    }

    public void deleteClient(Client client) {
        System.out.println("BookingSystem.deleteClient");
        repo.delete(client);
    }

    public Optional<Provider> getClientByID(int id) {
        return repo.findById(id);
    }

    public Optional<Provider> getClientByName(String name) {
        return repo.getClientByName(name);
    }
}
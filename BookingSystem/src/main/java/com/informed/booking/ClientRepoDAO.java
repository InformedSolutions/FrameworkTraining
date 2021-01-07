package com.informed.booking;

import com.informed.booking.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ClientRepoDAO {

    @Autowired
    private ClientRepository repo;

    public List<Client> getAllClients() {
        System.out.println("BookingSystem.getClient");
        Iterable<Client> iterable = repo.findAll();
        List<Client> clients = new ArrayList<>();
        for (Client b : iterable) {
            clients.add(b);
        }
        return clients;
    }

    public void addClient(Client client) {
        System.out.println("BookingSystem.addClient(" + client + ")");
        repo.save(client);
    }

    public void deleteClient(Client client) {
        System.out.println("BookingSystem.deleteClient");
        repo.delete(client);
    }

    public Optional<Client> getClientByID(int id) {
        return repo.findById(id);
    }

    public Optional<Client> getClientByName(String name) {
        return repo.getClientByName(name);
    }
}
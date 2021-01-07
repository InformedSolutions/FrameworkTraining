package com.informed.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProviderRepoDAO {

    @Autowired
    private ProviderRepository repo;

    public List<Provider> getAllProviders() {
        System.out.println("BookingSystem.getProviders");
        Iterable<Provider> iterable = repo.findAll();
        List<Provider> providers = new ArrayList<>();
        for (Provider b : iterable) {
            providers.add(b);
        }
        return providers;
    }

    public void saveProvider(Provider provider) {
        System.out.println("BookingSystem.saveProvider(" + provider + ")");
        repo.save(provider);
    }

    public void deleteProvider(Provider provider) {
        System.out.println("BookingSystem.deleteProvider");
        repo.delete(provider);
    }

    public Optional<Provider> getProviderByID(int id) {
        return repo.findById(id);
    }

    public Optional<Provider> getProviderByName(String name) {
        return repo.getProviderByName(name);
    }
}
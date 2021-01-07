package com.informed.booking;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

    @Query(value = "SELECT * FROM clients WHERE client.name=?1",
            nativeQuery = true)
    Optional<Client> getClientByName(String name);

}
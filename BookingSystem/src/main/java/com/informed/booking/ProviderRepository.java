package com.informed.booking;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Integer> {

    @Query(value = "SELECT * FROM providers WHERE provider.name=?1",
            nativeQuery = true)
    Optional<Provider> getProviderByName(String title);

}
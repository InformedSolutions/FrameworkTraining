package com.informed.FamilyTree.repository;

import com.informed.FamilyTree.domain.Person;
import com.informed.FamilyTree.domain.Place;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Place, String > {
}

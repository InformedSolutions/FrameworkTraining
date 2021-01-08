package com.informed.FamilyTree.repository;

import com.informed.FamilyTree.domain.Person;
import com.informed.FamilyTree.domain.Place;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.SQLException;

@Repository
public interface PlaceRepository extends CrudRepository<Place, String > {
}

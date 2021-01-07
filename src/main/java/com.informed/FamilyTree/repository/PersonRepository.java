package com.informed.FamilyTree.repository;

import com.informed.FamilyTree.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, String > {
}

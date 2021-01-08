package com.informed.FamilyTree.repository;

import com.informed.FamilyTree.domain.Marriage;
import com.informed.FamilyTree.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarriageRepository extends CrudRepository<Marriage, String > {
}

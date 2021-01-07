package com.informed.FamilyTree.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

    @Autowired
    private PersonRepository personRepo;

    public PersonDAO(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }
}

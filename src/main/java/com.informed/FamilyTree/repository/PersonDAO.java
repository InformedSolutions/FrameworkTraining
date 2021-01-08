package com.informed.FamilyTree.repository;

import com.informed.FamilyTree.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

    @Autowired
    private PersonRepository personRepo;

    public PersonDAO(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public Iterable<Person> getAllPersons() {
        return personRepo.findAll();
    }

    public void savePerson (Person person) {
        personRepo.save(person);
    }


}

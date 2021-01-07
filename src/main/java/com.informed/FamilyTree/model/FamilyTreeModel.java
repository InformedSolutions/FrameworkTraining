package com.informed.FamilyTree.model;

import com.informed.FamilyTree.domain.Person;
import com.informed.FamilyTree.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FamilyTreeModel {

    // Autowiring goes here
    @Autowired
    private PersonDAO personRepo;

    // Declarations
    private final List<Person> persons = new ArrayList<> ();

    // PersonDAO
    public List<Person> getAllPersons () {
        System.out.println("FamilyTreeModel.getPersons( +" + persons + ")");
        Iterable<Person> iterate = personRepo.getAllPersons();
        List<Person> allPersons = new ArrayList<>();
        for (Person person : iterate) {
            allPersons.add(person);
        }
        return allPersons;
    }
}

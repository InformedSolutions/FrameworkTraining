package com.informed.FamilyTree.model;

import com.informed.FamilyTree.domain.Marriage;
import com.informed.FamilyTree.domain.Person;
import com.informed.FamilyTree.repository.MarriageDAO;
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
    @Autowired
    private MarriageDAO marriageRepo;

    // Declarations
    private final List<Person> persons = new ArrayList<> ();
    private final List<Marriage> marriages = new ArrayList<>();

    // PersonDAO
    public List<Person> getAllPersons () {
        System.out.println("FamilyTreeModel.getAllPersons( " + persons + ")");
        Iterable<Person> iterate = personRepo.getAllPersons();
        List<Person> allPersons = new ArrayList<>();
        for (Person person : iterate) {
            allPersons.add(person);
        }
        return allPersons;
    }
    // Marriage DAO
    public List<Marriage> getAllMarriages() {
        System.out.println("FamilyTreeModel.getAllMarriages( " + marriages + ")");
        Iterable<Marriage> iterate = marriageRepo.getAllMarriages();
        List <Marriage> allMarriages = new ArrayList<>();
        for (Marriage marriage : iterate) {
            allMarriages.add(marriage);
        }
        return allMarriages;
    }
    // Place DAO

}

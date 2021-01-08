package com.informed.FamilyTree.model;

import com.informed.FamilyTree.domain.Marriage;
import com.informed.FamilyTree.domain.Person;
import com.informed.FamilyTree.domain.Place;
import com.informed.FamilyTree.repository.MarriageDAO;
import com.informed.FamilyTree.repository.PersonDAO;
import com.informed.FamilyTree.repository.PlaceDAO;
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
    @Autowired
    private PlaceDAO placeRepo;

    // Declarations
    private final List<Person> persons = new ArrayList<> ();
    private final List<Marriage> marriages = new ArrayList<>();
    private final List<Place> places = new ArrayList<>();

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
    public List<Place> getAllPlaces() {
        System.out.println("FamilyTreeModel.getAllPlaces( " + places + ")");
        Iterable<Place> iterate = placeRepo.getAllPlaces();
        List<Place> allPlaces = new ArrayList<>();
        for (Place place : iterate) {
            allPlaces.add(place);
        }
        return allPlaces;
    }

}

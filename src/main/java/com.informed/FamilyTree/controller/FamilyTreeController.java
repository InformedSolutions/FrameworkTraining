package com.informed.FamilyTree.controller;

import com.informed.FamilyTree.domain.Marriage;
import com.informed.FamilyTree.domain.Person;
import com.informed.FamilyTree.domain.Place;
import com.informed.FamilyTree.model.FamilyTreeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("FamilyTree")
public class FamilyTreeController {

    @Autowired
    private FamilyTreeModel familyTreeModel;

    /*
     * Persons Controller.
     * Use this area to add code related to Person
     */
    @GetMapping("persons/list")
    public List<Person> getAllPersons() {
        System.out.println("FamilyTreeController.getAllPersons(" + familyTreeModel + ")");
        return familyTreeModel.getAllPersons();
    }

    @PostMapping("persons")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPerson(@RequestBody Person person) {
        System.out.println("FamilyTreeController.getAllPersons(" + familyTreeModel + ")");
        this.familyTreeModel.addPerson(person);
    }
    /*
     * Marriage Controller.
     * Use this area to add code related to Marriage
     */
    @GetMapping("marriage/list")
    public List<Marriage> getAllMarriages() {
        System.out.println("FamilyTreeController.getAllMarriages( " + familyTreeModel + ')');
        return familyTreeModel.getAllMarriages();
    }
    /*
     * Place Controller.
     * Use this area to add code related to Place
     */
    @GetMapping("place/list")
    public List<Place> getAllPlaces() {
        System.out.println("FamilyTreeController.getAllPlaces( " + familyTreeModel + ')');
        return familyTreeModel.getAllPlaces();
    }

}


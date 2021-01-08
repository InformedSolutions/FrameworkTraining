package com.informed.FamilyTree.controller;

import com.informed.FamilyTree.domain.Marriage;
import com.informed.FamilyTree.domain.Person;
import com.informed.FamilyTree.model.FamilyTreeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("list")
    public List<Person> getAllPersons() {
        System.out.println("FamilyTreeController.getAllPersons(" + familyTreeModel + ")");
        return familyTreeModel.getAllPersons();
    }
    /*
     * Marriage Controller.
     * Use this area to add code related to Marriage
     */
    @GetMapping("list")
    public List<Marriage> getAllMarriages() {
        System.out.println("FamilyTreeController.getAllMarriages( " + familyTreeModel + ')');
        return familyTreeModel.getAllMarriages();
    }

    /*
     * Place Controller.
     * Use this area to add code related to Place
     */
}


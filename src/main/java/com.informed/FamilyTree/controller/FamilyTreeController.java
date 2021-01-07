package com.informed.FamilyTree.controller;

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
    private FamilyTreeModel person;

    @GetMapping("list")
    public List<Person> getAllPersons() {
        System.out.println("FamilyTreeController.getAllPersons(" + person + ")");
        return person.getAllPersons();
    }
}

package com.informed.FamilyTree.repository;

import com.informed.FamilyTree.domain.Marriage;
import com.informed.FamilyTree.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MarriageDAO {

    @Autowired
    private MarriageRepository marriageRepo;

    public MarriageDAO(MarriageRepository marriageRepo) {
        this.marriageRepo = marriageRepo;
    }

    public Iterable<Marriage> getAllMarriages() {
        return marriageRepo.findAll();
    }
}

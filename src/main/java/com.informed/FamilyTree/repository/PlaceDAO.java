package com.informed.FamilyTree.repository;

import com.informed.FamilyTree.domain.Person;
import com.informed.FamilyTree.domain.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaceDAO {
    @Autowired
    private PlaceRepository placeRepo;

    public PlaceDAO(PlaceRepository placeRepo) {
        this.placeRepo = placeRepo;
    }

    public Iterable<Place> getAllPlaces() {
        return placeRepo.findAll();
    }
}


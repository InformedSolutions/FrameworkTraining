package com.informed.FamilyTree.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "place")
public class Place {

    @Id
    private int placeID;
    private String placeAddress;
    private String placePostcode;

    public Place (){

    }
    public Place(int placeID, String placeAddress, String placePostcode) {
        this.placeID = placeID;
        this.placeAddress = placeAddress;
        this.placePostcode = placePostcode;
    }

    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress;
    }

    public String getPlacePostcode() {
        return placePostcode;
    }

    public void setPlacePostcode(String placePostcode) {
        this.placePostcode = placePostcode;
    }
}


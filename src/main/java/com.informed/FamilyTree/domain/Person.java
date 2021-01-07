package com.informed.FamilyTree.domain;

import javax.persistence.*;
import java.util.Date;


/*
 * Person Class references the familytree table within mySQL.
 * Constructors, getters and setters for all values
 * toString function to change data into String
 */
@Entity
@Table(name="person")
public class Person {

    @Id
    private int personID;
    private String personName;
    private String sex;
    private Date dob;
    @ManyToOne(fetch = FetchType.EAGER,
            cascade =  CascadeType.ALL)
    @JoinColumn(name="birthPlaceId")
    private Place birthPlace;
    private Date deathDate;

    @ManyToOne(fetch = FetchType.EAGER,
            cascade =  CascadeType.ALL)
    @JoinColumn(name="deathPlaceId")
    private Place deathPlace;
    private boolean isMarried;
    private boolean hasChildren;

    public Person () {

    }
    public Person(int personID, String personName, String sex, Date dob,
                  Place birthPlace, Date deathDate, Place deathPlace,
                  Boolean isMarried, Boolean hasChildren) {
        this.personID = personID;
        this.personName = personName;
        this.sex = sex;
        this.dob = dob;
        this.birthPlace = birthPlace;
        this.deathDate = deathDate;
        this.deathPlace = deathPlace;
        this.isMarried = isMarried;
        this.hasChildren = hasChildren;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Place getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(Place birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public Place getDeathPlace() {
        return deathPlace;
    }

    public void setDeathPlaceID(Place deathPlaceID) {
        this.deathPlace = deathPlace;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    @Override
    public String
    toString() {
        return "Person details{ " +
                "personID: " + personID +
                ", personName: '" + personName + '\'' +
                ", sex: '" + sex + '\'' +
                ", dob: " + dob +
                ", birthPlace: " + birthPlace +
                ", deathDate: " + deathDate +
                ", deathPlace: " + deathPlace +
                ", isMarried: " + isMarried +
                ", hasChildren: " + hasChildren +
                '}';
    }
}

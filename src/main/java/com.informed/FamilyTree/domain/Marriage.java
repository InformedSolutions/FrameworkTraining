package com.informed.FamilyTree.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="marriage")
public class Marriage {

    @Id
    private int marriageID;
//    @Basic
//    @Temporal(TemporalType.DATE)
    private Date marriageDate;
    @ManyToOne(fetch = FetchType.EAGER,
            cascade =  CascadeType.ALL)
    @JoinColumn(name="marriagePlaceID")
    private Place marriagePlace;
    private int husbandID;
    private int wifeID;

    //Zero param constructor for JDBC
    public Marriage (){}

    public Marriage(int marriageID, Date marriageDate,
                    Place marriagePlace, int husbandID, int wifeID) {
        this.marriageID = marriageID;
        this.marriageDate = marriageDate;
        this.marriagePlace = marriagePlace;
        this.husbandID = husbandID;
        this.wifeID = wifeID;
    }

    public int getMarriageID() {
        return marriageID;
    }

    public void setMarriageID(int marriageID) {
        this.marriageID = marriageID;
    }

    public Date getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(Date marriageDate) {
        this.marriageDate = marriageDate;
    }

    public Place getMarriagePlaceID() {
        return marriagePlace;
    }

    public void setMarriagePlaceID(Place marriagePlace) {
        this.marriagePlace = marriagePlace;
    }

    public int getHusbandID() {
        return husbandID;
    }

    public void setHusbandID(int husbandID) {
        this.husbandID = husbandID;
    }

    public int getWifeID() {
        return wifeID;
    }

    public void setWifeID(int wifeID) {
        this.wifeID = wifeID;
    }

    @Override
    public String toString() {
        return "Marriage{ " +
                "marriageID: " + marriageID +
                ", marriageDate: " + marriageDate +
                ", marriagePlaceID: " + marriagePlace +
                ", husbandID: " + husbandID +
                ", wifeID: " + wifeID +
                " }";
    }
}



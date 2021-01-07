package com.informed.booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "providers")
public class Provider {

    @Id
    private int id;
    private String name;
    @Column(name = "areaofexpertise")
    private String areaOfExpertise;

    public Provider() {}

    public Provider(int id, String name, String areaOfExpertise) {
        this.id = id;
        this.name = name;
        this.areaOfExpertise = areaOfExpertise;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", areaOfExpertise='" + areaOfExpertise + '\'' +
                '}';
    }
}


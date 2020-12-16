package com.informed.bookshop.books;

public class Address {
    private int number;
    private String address;
    private String city;
    private String county;
    private String postcode;


    public Address(int number, String address, String city, String county, String postcode) {
        this.number = number;
        this.address = address;
        this.city = city;
        this.county = county;
        this.postcode = postcode;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getNumber() {
        return this.number;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getCounty() {
        return this.county;
    }

    public String getPostcode() {
        return this.postcode;
    }

    @Override
    public String toString() {
        return number + ", " + address + ", " + city + ", " + county + ", " + postcode;
    }
}

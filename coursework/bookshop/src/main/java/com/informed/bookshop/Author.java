package com.informed.bookshop;

public class Author {

    private String name;
    private Address address;

    public Author(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author(" + name + '\'' +
                ", " + address +
                ')';
    }
}

package com.informed.bookshop;

public abstract class Contact {

    private String name;
    private Address address;

    public Contact(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Contact() { }

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
        return "Contact(" + name + '\'' +
                ", " + address +
                ')';
    }

}

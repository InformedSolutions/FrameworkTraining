package com.informed.bookshop.books;

import com.informed.bookshop.books.Address;

public class Publisher {
    private String name;
    private Address address;

    public Publisher(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Publisher(" + "Name: " + name  + ", Address:'" + address + ')';
    }
}

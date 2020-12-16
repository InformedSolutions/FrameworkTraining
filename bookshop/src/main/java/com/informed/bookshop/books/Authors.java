package com.informed.bookshop.books;

import com.informed.bookshop.books.Address;

public class Authors implements PrettyPrinter {
    private String name;
    private Address address;
    private String genre;

    public Authors(String name, int age, Address address, String Genre) {
        this.name = name;
        this.address = address;
        this.genre = genre;

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
        return "Authors (" +
                "name: " + name  + ", address: " + address  + ')';
    }

    @Override
    public void prettyPrint() {
        System.out.println("Print this");
    }
}

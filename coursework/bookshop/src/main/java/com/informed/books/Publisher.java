package com.informed.books;
/**
 * Represents organisations that publish things,
 * such as books, or music etc.
 */
public class Publisher {
    private String name;
    private Address address;

    public Publisher(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public Address getAddress() { return this.address; }

    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        return String.format("Publisher [name=%s, address=%s]", name, address);
    }
}
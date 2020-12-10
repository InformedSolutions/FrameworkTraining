package com.informed.books;
/**
 * Represents an author or creator of something.
 */
public class Author {
    private String name;
    private Address address;

    public Author(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public Address getAddress() { return this.address; }

    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        return String.format("Author [name=%s, address=%s]", name, address);
    }
}

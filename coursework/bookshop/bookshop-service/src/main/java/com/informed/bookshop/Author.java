package com.informed.bookshop;

public class Author extends Contact implements PrettyPrinter{

    private  String genre;

    public Author(String name, Address address) {
        super(name, address);
        this.genre = "Words on Pages";
    }

    public Author(String name, Address address, String genre) {
        super(name, address);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Author(" + this.getName() + '\'' +
                ", " + this.getAddress() +
                ", " + genre +
                ')';
    }

    @Override
    public void prettyPrint() {
        System.out.println("=======================AUTHOR==========================");
        System.out.println("Name:    " + this.getName());
        System.out.println("Address: " + this.getAddress().getAddressString());
        System.out.println("Genre:   " + this.genre);
        System.out.println("=======================================================");
    }
}

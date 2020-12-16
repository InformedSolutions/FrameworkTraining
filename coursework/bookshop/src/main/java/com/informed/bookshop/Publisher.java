package com.informed.bookshop;

public class Publisher extends Contact implements PrettyPrinter{

    private String publisherName;

    public Publisher(String name, Address publisherAddress, String publisherName) {
        super(name, publisherAddress);
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher(" +
                this.getName() + ", " + this.getAddress() +
                ", " + publisherName +
                ')';
    }

    @Override
    public void prettyPrint() {

        System.out.println("=======================PUBLISHER=======================");
        System.out.println("Name:    " + this.getName());
        System.out.println("Address: " + this.getAddress().getAddressString());
        System.out.println("Company: " + this.publisherName);
        System.out.println("=======================================================");

    }
}

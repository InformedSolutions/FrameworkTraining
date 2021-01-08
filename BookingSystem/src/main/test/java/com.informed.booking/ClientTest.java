package com.informed.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {

    private Client client;

    @BeforeEach
    void setUp() {
        client = new Client(13, "Rachel Gaffney", "Informed Solutions, Altrincham", "12345", "rachel@email.com");
    }

    @AfterEach
    void tearDown() {
        client = null;
    }

    @Test
    void createClientTest() {
        int id = client.getId();
        String name = client.getName();
        String address = client.getAddress();
        String phoneNumber = client.getPhoneNumber();
        String emailAddress = client.getEmailAddress();
        assertEquals("Rachel Gaffney", name, "Name should be 'Rachel Gaffney'");
        assertEquals(client.getId(), id);
        assertEquals(client.getAddress(), address);
        assertEquals("12345", phoneNumber, "Phone number should be 12345");
        assertEquals(client.getEmailAddress(), emailAddress);
    }
}

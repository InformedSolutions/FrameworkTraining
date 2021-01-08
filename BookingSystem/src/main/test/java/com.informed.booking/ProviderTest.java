package com.informed.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProviderTest {

    private Provider provider;

    @BeforeEach
    void setUp() {
        provider = new Provider(11, "Rachel Gaffney", "Reiki");
    }

    @AfterEach
    void tearDown() {
        provider = null;
    }

    @Test
    void createClientTest() {
        int id = provider.getId();
        String name = provider.getName();
        String expertise = provider.getAreaOfExpertise();
        assertEquals("Rachel Gaffney", name, "Name should be 'Rachel Gaffney'");
        assertEquals(provider.getId(), id);
        assertEquals(provider.getAreaOfExpertise(), expertise);
    }
}

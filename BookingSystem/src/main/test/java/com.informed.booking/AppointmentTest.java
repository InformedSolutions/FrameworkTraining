package com.informed.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    private Appointment appointment;

    @BeforeEach
    void setUp() {
        appointment = new Appointment(23, "2021-02-01 10:00:00", "2021-02-01 12:00:00", "Luke Armstrong", "Rachel Gaffney", 175, null, true);
    }

    @AfterEach
    void tearDown() {
        appointment = null;
    }

    @Test
    void createAppointmentTest() {
        int id = appointment.getId();
        String startDateTime = appointment.getStartDateTime();
        String endDateTime = appointment.getEndDateTime();
        String provider = appointment.getProvider();
        String client = appointment.getClient();
        int cost = appointment.getCost();
        Boolean hasClientMissedAppointments = appointment.getHasClientMissedAppointments();
        assertEquals("Rachel Gaffney", client, "Client should be 'Rachel Gaffney'");
        assertEquals(appointment.getId(), id);
        assertEquals(appointment.getStartDateTime(), startDateTime);
        assertEquals(appointment.getEndDateTime(), endDateTime);
        assertEquals(appointment.getProvider(), provider);
        assertEquals(appointment.getHasClientMissedAppointments(), hasClientMissedAppointments);
        assertEquals(175, cost);
    }


}
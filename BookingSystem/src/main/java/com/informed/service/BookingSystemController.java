package com.informed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

//Booking System imports
import com.informed.booking.BookingSystem;
import com.informed.booking.Appointment;
import com.informed.booking.Client;
import com.informed.booking.Provider;


@RestController
@RequestMapping("booking")

public class BookingSystemController {

    @Autowired
    private BookingSystem booker;

    public BookingSystemController() throws SQLException {
    }

    //Appointment Mappings

    @GetMapping("appointmentList")
    public List<Appointment> getAllAppointments() {
        System.out.println("BookingSystemController.getAllAppointments()");
        return booker.getAllAppointments();
    }

    @GetMapping("{id}")
    public Appointment getAppointment(@PathVariable int id) {
        System.out.println("BookingSystemController.getAppointment(" + id + ")");
        return this.booker.getAppointmentByID(id).orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addAppointment(@RequestBody Appointment appointment) {
        System.out.println("BookingSystemController.addAppointment(" + appointment + ")");
        this.booker.addAppointment(appointment);
    }

    //Client Mappings

    @GetMapping("clientList")
    public List<Client> getAllClients() {
        System.out.println("BookingSystemController.getAllClients()");
        return booker.getAllClients();
    }

    @GetMapping("{id}")
    public Client getClient(@PathVariable int id) {
        System.out.println("BookingSystemController.getClient(" + id + ")");
        return this.booker.getClientByID(id).orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addClient(@RequestBody Client client) {
        System.out.println("BookingSystemController.addClient(" + client + ")");
        this.booker.addClient(client);
    }

    //Provider Mappings

    @GetMapping("providerList")
    public List<Provider> getAllProviders() {
        System.out.println("BookingSystemController.getAllProviders()");
        return booker.getAllProviders();
    }

    @GetMapping("{id}")
    public Provider getProvider(@PathVariable int id) {
        System.out.println("BookingSystemController.getProvider(" + id + ")");
        return this.booker.getProviderByID(id).orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addProvider(@RequestBody Provider provider) {
        System.out.println("BookingSystemController.addProvider(" + provider + ")");
        this.booker.addProvider(provider);
    }

}
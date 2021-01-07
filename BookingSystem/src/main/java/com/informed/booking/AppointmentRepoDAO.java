package com.informed.booking;

import com.informed.booking.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AppointmentRepoDAO {

    @Autowired
    private AppointmentRepository repo;

    public List<Appointment> getAllAppointments() {
        System.out.println("BookingSystem.getAppointment");
        Iterable<Appointment> iterable = repo.findAll();
        List<Appointment> appointments = new ArrayList<>();
        for (Appointment b : iterable) {
            appointments.add(b);
        }
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        System.out.println("BookingSystem.addAppointment(" + appointment + ")");
        repo.save(appointment);
    }

    public void deleteAppointment(Appointment appointment) {
        System.out.println("BookingSystem.deleteAppointment");
        repo.delete(appointment);
    }

    public Optional<Appointment> getAppointmentByID(int id) {
        return repo.findById(id);
    }

    public Optional<Appointment> getAppointmentByName(String name) {
        return repo.getAppointmentByName(name);
    }
}
package com.informed.booking.repositories;

import com.informed.booking.Appointment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {

    @Query(value = "SELECT * FROM appointments WHERE appointments.name=?1",
            nativeQuery = true)
    Optional<Appointment> getAppointmentByName(String name);

    @Query(value = "SELECT * FROM appointments WHERE appointments.client=?1",
            nativeQuery = true)
    List<Appointment> getClientAppointments(String clientName);

    @Query(value = "SELECT * FROM appointments WHERE appointments.provider=?1",
            nativeQuery = true)
    List<Appointment> getProviderAppointments(String providerName);
}
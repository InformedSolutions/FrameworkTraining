package com.informed.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;

@Component
public class BookingSystem {

    @Autowired
    private final AppointmentRepoDAO appointmentDAO = new AppointmentRepoDAO();

    @Autowired
    private final ClientRepoDAO clientDAO = new ClientRepoDAO();

    @Autowired
    private final ProviderRepoDAO providerDAO = new ProviderRepoDAO();

    public BookingSystem() throws SQLException {
    }


    //Appointment Linking

    public void addAppointment(Appointment appointment) {

        System.out.println(appointment.getStartDateTime());
        System.out.println(appointment.getEndDateTime());

        String clientName = clientDAO.getClientByID(Integer.parseInt(appointment.getClient())).orElse(null).getName();
        String providerName = providerDAO.getProviderByID(Integer.parseInt(appointment.getProvider())).orElse(null).getName();
        appointment.setClient(clientName);
        appointment.setProvider(providerName);

        if (providerScheduleCheck(appointment)){
            appointmentDAO.addAppointment(appointment);
        } else {
            System.out.println("Schedule Conflict!");
        }
        //appointmentDAO.addAppointment(appointment);
    }

    private boolean providerScheduleCheck(Appointment appointment) {

        LocalDateTime startTime = LocalDateTime.parse(appointment.getStartDateTime());
        LocalDateTime endTime = LocalDateTime.parse(appointment.getEndDateTime());
        List<Appointment> providerAppointments = appointmentDAO.getProviderAppointments(appointment.getProvider());

        for (Appointment app : providerAppointments) {
            if (checkConflict(startTime, endTime, app)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkConflict(LocalDateTime startTime, LocalDateTime endTime, Appointment app) {

        LocalDateTime appStartTime = LocalDateTime.parse(app.getStartDateTime().replace(" ","T"));
        LocalDateTime appEndTime = LocalDateTime.parse(app.getEndDateTime().replace(" ","T"));

        boolean conflict = false;

        if (appStartTime.isAfter(startTime) && appStartTime.isBefore(endTime)) {
            conflict = true;
        }

        if (appEndTime.isAfter(startTime) && appEndTime.isBefore(endTime)) {
            conflict = true;
        }

        if (appStartTime.isBefore(startTime) && appEndTime.isAfter(endTime)) {
            conflict = true;
        }

        return conflict;
    }

    public void deleteAppointment(Appointment appointment) {
        appointmentDAO.deleteAppointment(appointment);
    }

    public Optional<Appointment> getAppointmentByID(int id) {
        return appointmentDAO.getAppointmentByID(id);
    }

    public Optional<Appointment> getAppointmentByName(String name) {
        return appointmentDAO.getAppointmentByName(name);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentDAO.getAllAppointments();
    }

    public List<Appointment> getClientAppointments(int clientId) {
        Client client = getClientByID(clientId).orElse(null);
        String clientName = client.getName();
        return appointmentDAO.getClientAppointments(clientName);
    }

    public List<Appointment> getProviderAppointments(int providerId) {
        Provider provider = getProviderByID(providerId).orElse(null);
        String providerName = provider.getName();
        return appointmentDAO.getProviderAppointments(providerName);
    }

    //Client Linking

    public void addClient(Client client) {
        clientDAO.addClient(client);
    }

    public void deleteClient(Client client) {
        clientDAO.deleteClient(client);
    }

    public Optional<Client> getClientByID(int id) {
        return clientDAO.getClientByID(id);
    }

    public Optional<Client> getClientByName(String name) {
        return clientDAO.getClientByName(name);
    }

    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }

    //Provider Linking

    public void addProvider(Provider provider) {
        providerDAO.addProvider(provider);
    }

    public void deleteProvider(Provider provider) {
        providerDAO.deleteProvider(provider);
    }

    public Optional<Provider> getProviderByID(int id) {
        return providerDAO.getProviderByID(id);
    }

    public Optional<Provider> getProviderByName(String name) {
        return providerDAO.getProviderByName(name);
    }

    public List<Provider> getAllProviders() {
        return providerDAO.getAllProviders();
    }

}
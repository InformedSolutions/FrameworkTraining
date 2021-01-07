package com.informed.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Component
public class BookingSystem {

    //private List<Book> books = new ArrayList<>();

    @Autowired
    private final AppointmentRepoDAO appointmentDAO = new AppointmentRepoDAO();

    @Autowired
    private final ClientRepoDAO clientDAO = new ClientRepoDAO();

    @Autowired
    private final ProviderRepoDAO providerDAO = new ProviderRepoDAO();

    public BookingSystem() throws SQLException {
    }


    //Appointment Linking

    public void saveAppointment(Appointment appointment) {
        appointmentDAO.saveAppointment(appointment);
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

    //Client Linking

    public void saveClient(Client client) {
        clientDAO.saveClient(client);
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

    public void saveProvider(Provider provider) {
        providerDAO.saveProvider(provider);
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
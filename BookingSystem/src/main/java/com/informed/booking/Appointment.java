package com.informed.booking;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    private int id;
    private String startDateTime;
    private String endDateTime;
    private String provider;
    private String client;
    private int cost;
    private String description;
    private Boolean hasClientMissedAppointments;

    public Appointment() {}

    public Appointment(int id, String startDateTime, String endDateTime, String provider, String client, int cost, String description, Boolean hasClientMissedAppointments) {
        this.id = id;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.client = client;
        this.cost = cost;
        this.description = description;
        this.hasClientMissedAppointments = hasClientMissedAppointments;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public String getProvider() {
        return provider;
    }

    public String getClient() {
        return client;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getHasClientMissedAppointments() {
        return hasClientMissedAppointments;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", startDateTime='" + startDateTime + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                ", provider='" + provider + '\'' +
                ", client='" + client + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", hasClientMissedAppointments=" + hasClientMissedAppointments +
                '}';
    }
}

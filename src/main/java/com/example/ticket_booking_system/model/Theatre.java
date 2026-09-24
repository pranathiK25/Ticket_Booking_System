package com.example.ticket_booking_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Theatre {
    @Id
    private int TheatreId;
    private String TheatreName;
    private String TheatreAddress;
    private String TheatreCity;
    private int TheatrePincode;
}

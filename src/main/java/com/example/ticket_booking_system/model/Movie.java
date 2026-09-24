package com.example.ticket_booking_system.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedEntityGraph;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private int MovieId;
    private String MovieName;
    private String MovieGenre;
    private String MovieDesc;
    private int MovieDuration;
}

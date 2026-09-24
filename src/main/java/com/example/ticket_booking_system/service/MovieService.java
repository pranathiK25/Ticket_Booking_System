package com.example.ticket_booking_system.service;

import com.example.ticket_booking_system.model.Movie;
import com.example.ticket_booking_system.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepo repo;

    public List<Movie> getMovies() {
        return repo.findAll();
    }
}

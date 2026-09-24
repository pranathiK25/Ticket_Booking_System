package com.example.ticket_booking_system.controller;

import com.example.ticket_booking_system.model.Movie;
import com.example.ticket_booking_system.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping("movies")
    public ResponseEntity<List<Movie>> getMovies(){
        List<Movie> movies = service.getMovies();
        if(movies != null) return new ResponseEntity<>(movies, HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

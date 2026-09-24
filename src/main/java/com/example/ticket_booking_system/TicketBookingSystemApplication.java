package com.example.ticket_booking_system;

import com.example.ticket_booking_system.model.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TicketBookingSystemApplication {

	public static void main(String[] args) {
		ApplicationContext c = SpringApplication.run(TicketBookingSystemApplication.class, args);

	}

}

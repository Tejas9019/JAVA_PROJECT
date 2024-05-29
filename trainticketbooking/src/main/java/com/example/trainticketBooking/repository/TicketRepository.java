package com.example.trainticketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.trainticketBooking.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}

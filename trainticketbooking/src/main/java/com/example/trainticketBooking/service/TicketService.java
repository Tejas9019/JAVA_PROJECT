package com.example.trainticketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trainticketBooking.model.Ticket;
import com.example.trainticketBooking.repository.TicketRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Optional<Ticket> findTicketById(Long id) {
        return ticketRepository.findById(id);
    }

    public List<Ticket> findTicketsBySection(String section) {
        return ticketRepository.findAll().stream()
                .filter(ticket -> section.equals(ticket.getSection()))
                .toList();
    }

    public void deleteTicketById(Long id) {
        ticketRepository.deleteById(id);
    }
}

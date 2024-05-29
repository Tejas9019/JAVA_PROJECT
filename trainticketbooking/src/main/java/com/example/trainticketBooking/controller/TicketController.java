package com.example.trainticketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.trainticketBooking.model.Ticket;
import com.example.trainticketBooking.model.User;
import com.example.trainticketBooking.service.TicketService;
import com.example.trainticketBooking.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @Autowired
    private UserService userService;

    @PostMapping("/purchase")
    public Ticket purchaseTicket(@RequestBody Ticket ticket) {
        User user = userService.saveUser(ticket.getUser());
        ticket.setUser(user);
        ticket.setFromLocation("London");
        ticket.setToLocation("France");
        ticket.setPrice(20.00);
        // Logic to allocate seat and section
        ticket.setSection("A"); // or "B", simplified for example
        ticket.setSeatNumber("1A"); // Simplified logic, should be dynamic
        return ticketService.saveTicket(ticket);
    }

    @GetMapping("/{id}")
    public Optional<Ticket> getTicket(@PathVariable Long id) {
        return ticketService.findTicketById(id);
    }

    @GetMapping("/section/{section}")
    public List<Ticket> getTicketsBySection(@PathVariable String section) {
        return ticketService.findTicketsBySection(section);
    }

    @DeleteMapping("/remove/{id}")
    public void removeTicket(@PathVariable Long id) {
        ticketService.deleteTicketById(id);
    }

    @PutMapping("/modify/{id}")
    public Ticket modifyTicket(@PathVariable Long id, @RequestBody Ticket modifiedTicket) {
        Optional<Ticket> optionalTicket = ticketService.findTicketById(id);
        if (optionalTicket.isPresent()) {
            Ticket ticket = optionalTicket.get();
            ticket.setSection(modifiedTicket.getSection());
            ticket.setSeatNumber(modifiedTicket.getSeatNumber());
            return ticketService.saveTicket(ticket);
        } else {
            return null;
        }
    }
}

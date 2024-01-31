package fr.cch.cinema.cinema.controller;

import fr.cch.cinema.cinema.entity.Ticket;
import fr.cch.cinema.cinema.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/save")
    public Ticket saveTicket(@RequestBody Ticket ticket) {
        return ticketService.create(ticket);
    }

    @PatchMapping("/update")
    public Ticket updateTicket(@RequestBody Ticket ticket) {
        return ticketService.update(ticket);
    }

    @GetMapping("/all")
    public List<Ticket> getAllTickets() {
        return ticketService.findAll();
    }

    @GetMapping("/{id}")
    public Ticket getTicketByID(@PathVariable Long id) {
        return ticketService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Ticket deleteTicketByID(@PathVariable Long id) {
        return ticketService.deleteById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllTickets() {
        ticketService.deleteAll();
    }

}

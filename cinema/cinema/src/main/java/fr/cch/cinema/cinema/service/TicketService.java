package fr.cch.cinema.cinema.service;

import fr.cch.cinema.cinema.entity.Ticket;
import fr.cch.cinema.cinema.exception.NotFoundException;
import fr.cch.cinema.cinema.repository.TicketRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    public Ticket findById(Long id) {
        return ticketRepository.findById(id).orElseThrow(() -> new NotFoundException("Ticket non trouvé !"));
    }

    public Ticket create(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket update(Ticket ticket) {
        Long ticketId = ticket.getId();
        Ticket ticketToFind = findById(ticketId);
        ticketToFind.setClient(ticket.getClient());
        ticketToFind.setPlace(ticket.getPlace());
        ticketToFind.setPrix(ticket.getPrix());
        ticketToFind.setClient(ticket.getClient());
        return ticketRepository.save(ticketToFind);
    }

    public Ticket deleteById(Long id) {
        Ticket ticket = findById(id);
        ticketRepository.deleteById(id);
        return ticket;
    }

    public void deleteAll() { ticketRepository.deleteAll(); }

}

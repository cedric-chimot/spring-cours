package fr.cch.cinema.cinema.repository;

import fr.cch.cinema.cinema.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository  extends JpaRepository<Ticket, Long> {
}

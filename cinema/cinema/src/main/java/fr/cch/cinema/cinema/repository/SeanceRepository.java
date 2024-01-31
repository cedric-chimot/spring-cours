package fr.cch.cinema.cinema.repository;

import fr.cch.cinema.cinema.entity.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository  extends JpaRepository<Seance, Long> {
}

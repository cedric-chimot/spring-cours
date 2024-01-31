package fr.cch.cinema.cinema.repository;

import fr.cch.cinema.cinema.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}

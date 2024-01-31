package fr.cch.cinema.cinema.service;

import fr.cch.cinema.cinema.entity.Film;
import fr.cch.cinema.cinema.exception.NotFoundException;
import fr.cch.cinema.cinema.repository.FilmRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    public Film findById(Long id) {
        return filmRepository.findById(id).orElseThrow(() -> new NotFoundException("Film non trouvé !"));
    }

    public Film create(Film film) {
        return filmRepository.save(film);
    }

    public Film update(Film film) {
        Long filmId = film.getId();
        Film filmToFind = findById(filmId);
        filmToFind.setTitre(film.getTitre());
        filmToFind.setDateSortie(film.getDateSortie());
        filmToFind.setDuree(film.getDuree());
        filmToFind.setResume(film.getResume());
        return filmRepository.save(filmToFind);
    }

    public Film deleteById(Long id) {
        Film film = findById(id);
        filmRepository.deleteById(id);
        return film;
    }

    public void deleteAll() { filmRepository.deleteAll(); }

}

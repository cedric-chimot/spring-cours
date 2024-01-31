package fr.cch.cinema.cinema.controller;

import fr.cch.cinema.cinema.entity.Film;
import fr.cch.cinema.cinema.service.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping("/save")
    public Film saveFilm(@RequestBody Film film) {
        return filmService.create(film);
    }

    @PatchMapping("/update")
    public Film updateFilm(@RequestBody Film film) {
        return filmService.update(film);
    }

    @GetMapping("/all")
    public List<Film> getAllFilms() {
        return filmService.findAll();
    }

    @GetMapping("/{id}")
    public Film getFilmByID(@PathVariable Long id) {
        return filmService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Film deleteFilmByID(@PathVariable Long id) {
        return filmService.deleteById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllFilms() {
        filmService.deleteAll();
    }

}

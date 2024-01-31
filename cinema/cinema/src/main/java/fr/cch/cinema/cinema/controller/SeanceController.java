package fr.cch.cinema.cinema.controller;

import fr.cch.cinema.cinema.entity.Seance;
import fr.cch.cinema.cinema.service.SeanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seances")
public class SeanceController {

    private final SeanceService seanceService;

    public SeanceController(SeanceService seanceService) {
        this.seanceService = seanceService;
    }

    @PostMapping("/save")
    public Seance saveSeance(@RequestBody Seance seance) {
        return seanceService.create(seance);
    }

    @PatchMapping("/update")
    public Seance updateSeance(@RequestBody Seance seance) {
        return seanceService.update(seance);
    }

    @GetMapping("/all")
    public List<Seance> getAllSeances() {
        return seanceService.findAll();
    }

    @GetMapping("/{id}")
    public Seance getSeanceByID(@PathVariable Long id) {
        return seanceService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Seance deleteSeanceByID(@PathVariable Long id) {
        return seanceService.deleteById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllSeances() {
        seanceService.deleteAll();
    }

}

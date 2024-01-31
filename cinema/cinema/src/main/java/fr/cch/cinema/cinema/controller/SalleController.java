package fr.cch.cinema.cinema.controller;

import fr.cch.cinema.cinema.entity.Salle;
import fr.cch.cinema.cinema.service.SalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salles")
public class SalleController {

    private final SalleService salleService;

    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }

    @PostMapping("/save")
    public Salle saveSalle(@RequestBody Salle salle) {
        return salleService.create(salle);
    }

    @PatchMapping("/update")
    public Salle updateSalle(@RequestBody Salle salle) {
        return salleService.update(salle);
    }

    @GetMapping("/all")
    public List<Salle> getAllSalles() {
        return salleService.findAll();
    }

    @GetMapping("/{id}")
    public Salle getSalleByID(@PathVariable Long id) {
        return salleService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Salle deleteSalleByID(@PathVariable Long id) {
        return salleService.deleteById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllSalles() {
        salleService.deleteAll();
    }

}

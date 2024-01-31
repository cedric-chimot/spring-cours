package fr.cch.cinema.cinema.controller;

import fr.cch.cinema.cinema.entity.Realisateur;
import fr.cch.cinema.cinema.service.RealisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/realisateurs")
public class RealisateurController {

    private final RealisateurService realisateurService;

    public RealisateurController(RealisateurService realisateurService) {
        this.realisateurService = realisateurService;
    }

    @PostMapping("/save")
    public Realisateur saveRealisateur(@RequestBody Realisateur realisateur) {
        return realisateurService.create(realisateur);
    }

    @PatchMapping("/update")
    public Realisateur updateRealisateur(@RequestBody Realisateur realisateur) {
        return realisateurService.update(realisateur);
    }

    @GetMapping("/all")
    public List<Realisateur> getAllRealisateurs() {
        return realisateurService.findAll();
    }

    @GetMapping("/{id}")
    public Realisateur getRealisateurByID(@PathVariable Long id) {
        return realisateurService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Realisateur deleteRealisateurByID(@PathVariable Long id) {
        return realisateurService.deleteById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllRealisateurs() {
        realisateurService.deleteAll();
    }

}

package fr.cch.cinema.cinema.controller;

import fr.cch.cinema.cinema.dto.ActeurCompletDTO;
import fr.cch.cinema.cinema.dto.ActeurReduitDTO;
import fr.cch.cinema.cinema.entity.Acteur;
import fr.cch.cinema.cinema.service.ActeurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acteurs")
public class ActeurController {

    private final ActeurService acteurService;

    public ActeurController(ActeurService acteurService) {
        this.acteurService = acteurService;
    }

    @PostMapping("/save")
    public ActeurCompletDTO saveActeur(@RequestBody Acteur acteur) {
        return acteurService.create(acteur);
    }

    @PatchMapping("/update")
    public ActeurCompletDTO updateActeur(@RequestBody Acteur acteur) {
        return acteurService.update(acteur);
    }

    @GetMapping("/all")
    public List<ActeurReduitDTO> getAllActeurs() {
        return acteurService.findAll();
    }

    @GetMapping("/{id}")
    public ActeurCompletDTO getActeurByID(@PathVariable Long id) {
        return acteurService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ActeurCompletDTO deleteActeurByID(@PathVariable Long id) {
        return acteurService.deleteById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllActeurs() {
        acteurService.deleteAll();
    }

}

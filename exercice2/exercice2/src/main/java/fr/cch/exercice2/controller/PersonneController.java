package fr.cch.exercice2.controller;

import fr.cch.exercice2.entity.Personne;
import fr.cch.exercice2.service.PersonneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personnes")
@CrossOrigin
public class PersonneController {
    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping("/all")
    public List<Personne> findAll() {
        return personneService.findAll();
    }

    @GetMapping("/find/{id}")
    public Optional<Personne> findById(@PathVariable int id) {
        return personneService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Personne personne) {
        personneService.save(personne);
    }

    @DeleteMapping("/delete")
    public void deleteAll() {
        personneService.deleteAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        personneService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Personne personne) {
        personneService.update(personne);
    }

}

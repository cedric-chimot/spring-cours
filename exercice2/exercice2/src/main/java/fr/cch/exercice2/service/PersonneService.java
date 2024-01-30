package fr.cch.exercice2.service;

import fr.cch.exercice2.entity.Personne;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {

    private final List<Personne> personnes = new ArrayList<>();

    public List<Personne> findAll() {
        return personnes;
    }

    public Optional<Personne> findById(int id) {
        return personnes
                .stream()
                .filter(Personne -> Personne.getId() == id)
                .findFirst();
    }

    public void save(Personne personne) {
        personnes.add(personne);
    }

    public void deleteAll() {
        personnes.clear();
    }

    public void deleteById(int id) {
        personnes.removeIf(Personne -> Personne.getId() == id);
    }

    public void update(Personne personne) {
        deleteById(personne.getId());
        save(personne);
    }

}

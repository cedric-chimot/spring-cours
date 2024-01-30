package fr.cch.recettes.service;

import fr.cch.recettes.entity.Recette;
import fr.cch.recettes.repository.RecetteRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RecetteService {

    private final JdbcTemplate jdbcTemplate;

    private final RecetteRepository repository;

    public RecetteService(JdbcTemplate jdbcTemplate, RecetteRepository repository) {
        this.jdbcTemplate = jdbcTemplate;
        this.repository = repository;
    }

    public List<Recette> findAll() {
        return repository.findAll();
    }

    public Recette findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Recette create(Recette recette) {
        return repository.save(recette);
    }

    public Recette update(Recette recette) {
        if (recette.getId() == null) {
            repository.save(recette);
        } else {
            jdbcTemplate.update("UPDATE recette SET nomRecette = ? WHERE id = ?",
                    recette.getNom(), recette.getId());
        }
        return recette;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

}

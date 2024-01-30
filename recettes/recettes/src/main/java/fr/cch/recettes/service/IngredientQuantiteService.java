package fr.cch.recettes.service;

import fr.cch.recettes.entity.IngredientQuantite;
import fr.cch.recettes.repository.IngredientQuantiteRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class IngredientQuantiteService {
    private final JdbcTemplate jdbcTemplate;

    private final IngredientQuantiteRepository repository;

    public IngredientQuantiteService(JdbcTemplate jdbcTemplate, IngredientQuantiteRepository repository) {
        this.jdbcTemplate = jdbcTemplate;
        this.repository = repository;
    }

    public List<IngredientQuantite> findAll() {
        return repository.findAll();
    }

    public IngredientQuantite findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public IngredientQuantite create(IngredientQuantite ingredientQuantite) {
        return repository.save(ingredientQuantite);
    }

    public IngredientQuantite update(IngredientQuantite ingredientQuantite) {
        if (ingredientQuantite.getId() == null) {
            repository.save(ingredientQuantite);
        } else {
            jdbcTemplate.update("UPDATE recette SET nomRecette = ? WHERE id = ?",
                    ingredientQuantite.getQuantite(), ingredientQuantite.getId());
        }
        return ingredientQuantite;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

}

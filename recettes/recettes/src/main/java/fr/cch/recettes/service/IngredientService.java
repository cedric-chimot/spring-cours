package fr.cch.recettes.service;

import fr.cch.recettes.entity.Ingredients;
import fr.cch.recettes.repository.IngredientRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class IngredientService {

    private final JdbcTemplate jdbcTemplate;

    private final IngredientRepository repository;

    public IngredientService(JdbcTemplate jdbcTemplate, IngredientRepository repository) {
        this.jdbcTemplate = jdbcTemplate;
        this.repository = repository;
    }

    public List<Ingredients> findAll() {
        return repository.findAll();
    }

    public Ingredients findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Ingredients create(Ingredients ingredients) {
        return repository.save(ingredients);
    }

    public Ingredients update(Ingredients ingredients) {
        if (ingredients.getId() == null) {
            repository.save(ingredients);
        } else {
            jdbcTemplate.update("UPDATE recette SET nomIngredient = ? WHERE id = ?",
                    ingredients.getNom(), ingredients.getId());
        }
        return ingredients;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAll() {
        repository.deleteAll();
    }


}

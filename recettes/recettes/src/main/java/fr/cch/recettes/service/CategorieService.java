package fr.cch.recettes.service;

import fr.cch.recettes.entity.Categorie;
import fr.cch.recettes.repository.CategorieRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CategorieService {

    private final JdbcTemplate jdbcTemplate;

    private final CategorieRepository repository;

    public CategorieService(JdbcTemplate jdbcTemplate, CategorieRepository repository) {
        this.jdbcTemplate = jdbcTemplate;
        this.repository = repository;
    }

    public List<Categorie> findAll() {
        return repository.findAll();
    }

    public Categorie findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Categorie create(Categorie categorie) {
        return repository.save(categorie);
    }

    public Categorie update(Categorie categorie) {
        if (categorie.getId() == null) {
            repository.save(categorie);
        } else {
            jdbcTemplate.update("UPDATE categorie SET nomCategorie = ? WHERE id = ?",
                    categorie.getNom(), categorie.getId());
        }
        return categorie;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

}

package fr.cch.recettes.repository;

import fr.cch.recettes.entity.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredients, Long> {
}

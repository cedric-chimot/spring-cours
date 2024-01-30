package fr.cch.recettes.repository;

import fr.cch.recettes.entity.IngredientQuantite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientQuantiteRepository extends JpaRepository<IngredientQuantite, Long> {
}

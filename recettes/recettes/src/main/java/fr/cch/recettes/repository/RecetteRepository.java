package fr.cch.recettes.repository;

import fr.cch.recettes.entity.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetteRepository extends JpaRepository<Recette, Long> {
}

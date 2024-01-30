package fr.cch.recettes.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class IngredientQuantite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idQuantite")
    private Long id;

    @Column(name = "quantite_ingredient")
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "id_ingredient")
    private Ingredients ingredients;

    @ManyToOne
    @JoinColumn(name = "id_recette")
    private Recette recettes;

    public IngredientQuantite(Long id, int quantite) {
        this.id = id;
        this.quantite = quantite;
    }
}

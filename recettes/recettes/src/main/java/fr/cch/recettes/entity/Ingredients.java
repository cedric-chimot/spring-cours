package fr.cch.recettes.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idIngredient")
    private int id;

    @Column(name = "nomIngredient")
    private String nom;

    @OneToMany(mappedBy = "ingredients")
    private List<IngredientQuantite> quantites = new ArrayList<>();

    public Ingredients(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

}

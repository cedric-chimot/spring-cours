package fr.cch.recettes.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Recette {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRecette")
    private Long id;

    @Column(name = "nomRecette")
    private String nom;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "recettes")
    private List<IngredientQuantite> ingredientQuantites;

    @ManyToMany
    @JoinTable(
            name = "recette_categorie",
            joinColumns = @JoinColumn(name = "recette_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id")
    )
    private List<Categorie> categories;

    public Recette(Long id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

}

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
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategorie")
    private int id;

    @Column(name = "nomCategorie")
    private String nom;

    @ManyToMany(mappedBy = "categories")
    private List<Recette> listeRecettes;

}

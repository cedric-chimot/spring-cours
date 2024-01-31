package fr.cch.cinema.cinema.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe pour gérer les films
 */
@Data
@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFilm")
    private Long id;

    @NotBlank
    @Column(name = "titreFilm")
    private String titre;

    @NotBlank
    @Column(name = "dateSortie")
    @Temporal(TemporalType.DATE)
    private Date dateSortie;

    @NotBlank
    @Column(name = "dureeFilm")
    private int duree;

    @NotBlank
    @Column(name = "resume")
    @Size(min = 50, max = 500)
    private String resume;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "film_acteur",
            joinColumns = @JoinColumn(name = "id_film"),
            inverseJoinColumns = @JoinColumn(name = "id_acteur")
    )
    private List<Acteur> acteurs = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "film_real",
            joinColumns = @JoinColumn(name = "id_film"),
            inverseJoinColumns = @JoinColumn(name = "id_real")
    )
    private List<Realisateur> realisateurs = new ArrayList<>();

    @OneToMany(mappedBy = "film")
    private List<Seance> seances = new ArrayList<>();

}

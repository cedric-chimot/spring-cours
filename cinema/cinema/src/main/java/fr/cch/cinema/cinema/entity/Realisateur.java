package fr.cch.cinema.cinema.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Realisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReal")
    private Long id;

    @Column(name = "nomReal")
    @NotBlank
    private String nom;

    @Column(name = "prenomReal")
    @NotBlank
    private String prenom;

    @ManyToMany(mappedBy = "realisateurs")
    private List<Film> films = new ArrayList<>();

}

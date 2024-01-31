package fr.cch.cinema.cinema.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Acteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idActeur")
    private Long id;

    @NotBlank
    private String nom;

    @NotBlank
    private String prenom;

    @ManyToMany(mappedBy = "acteurs")
    private List<Film> films = new ArrayList<>();

    @Override
    public String toString() {
        return "Acteur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

package fr.cch.cinema.cinema.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSalle")
    private Long id;

    @Column(name = "numSalle")
    @NotBlank
    private int numero;

    @Column(name = "nbPlaces")
    @NotBlank
    private int capacite;

    @OneToMany(mappedBy = "salle")
    private List<Seance> seances = new ArrayList<>();

}

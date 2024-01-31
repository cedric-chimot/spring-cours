package fr.cch.cinema.cinema.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSeance")
    private Long id;

    @NotBlank
    @Column(name = "dateSeance")
    @Temporal(TemporalType.DATE)
    private Date dateSeance;

    @ManyToOne
    @JoinColumn(name = "id_salle")
    private Salle salle;

    @ManyToOne
    @JoinColumn(name = "id_film")
    private Film film;

}

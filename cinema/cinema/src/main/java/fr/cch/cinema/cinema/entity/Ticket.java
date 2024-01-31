package fr.cch.cinema.cinema.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTicket")
    private Long id;

    @NotBlank
    @Column(name = "nomClient")
    private String client;

    @NotBlank
    @Column(name = "numPlace")
    private int place;

    @NotBlank
    @Column(name = "prix")
    private float prix;

    @ManyToOne
    @JoinColumn(name = "id_seance")
    private Seance seance;

}

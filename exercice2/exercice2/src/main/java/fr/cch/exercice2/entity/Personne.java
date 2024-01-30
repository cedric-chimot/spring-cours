package fr.cch.exercice2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personne {

    private int id;
    private String nom;
    private String prenom;
    private int age;

}

package fr.cch.exercices.exo2;

import org.springframework.stereotype.Component;

@Component
public class SteakComponent {
    public void ajoutSteak() {
        System.out.println("Il y a un steak dans le burger");
    }
}

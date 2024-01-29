package fr.cch.exercices.exo2;

import org.springframework.stereotype.Component;

@Component
public class SaladeComponent {
    public void ajoutSalade() {
        System.out.println("On ajoute de la salade au burger");
    }
}

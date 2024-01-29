package fr.cch.exercices.exo2;


import org.springframework.stereotype.Component;

@Component
public class PainComponent {
    public void ajoutPain() {
        System.out.println("Le burger comporte deux tranches de pain");
    }
}

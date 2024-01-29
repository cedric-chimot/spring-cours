package fr.cch.component;

import org.springframework.stereotype.Component;

@Component
public class MoteurComponent {
    public void demarrer() {
        System.out.println("Le moteur démarre !");
    }
}

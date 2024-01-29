package fr.cch.component;

import org.springframework.stereotype.Component;

@Component
public class VoitureComponent {
    private MoteurComponent moteur;

    public VoitureComponent(MoteurComponent moteur) {
        this.moteur = moteur;
    }

    public void rouler() {
        moteur.demarrer();
    }
}

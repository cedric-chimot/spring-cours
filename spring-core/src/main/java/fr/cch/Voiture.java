package fr.cch;

public class Voiture {
    private Moteur moteur;

    public Voiture(Moteur moteur) {
        this.moteur = moteur;
    }

    public void rouler() {
        moteur.demarrer();
    }

}

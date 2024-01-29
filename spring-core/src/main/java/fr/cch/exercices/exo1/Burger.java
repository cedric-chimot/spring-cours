package fr.cch.exercices.exo1;

public class Burger {
    private Pain pain;

    private Steak steak;

    private Salade salade;

    private Fromage fromage;

    public Burger(Pain pain, Steak steak, Salade salade, Fromage fromage) {
        this.pain = pain;
        this.steak = steak;
        this.salade = salade;
        this.fromage = fromage;
    }

    public void composer() {
        pain.ajoutPain();
        steak.ajoutSteak();
        salade.ajoutSalade();
        fromage.ajoutFromage();
    }
}

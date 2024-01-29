package fr.cch.exercices.exo2;

import org.springframework.stereotype.Component;

@Component
public class BurgerComponent {
    private PainComponent pain;

    private SteakComponent steak;

    private SaladeComponent salade;

    private FromageComponent fromage;

    public BurgerComponent(PainComponent pain, SteakComponent steak, SaladeComponent salade, FromageComponent fromage) {
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

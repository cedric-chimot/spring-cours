package fr.cch.calculatrice.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Calculatrice {

    private String operation;

    private int nb1;

    private int nb2;

    public Calculatrice(String operation, int nb1, int nb2) {
        this.operation = operation;
        this.nb1 = nb1;
        this.nb2 = nb2;
    }

}

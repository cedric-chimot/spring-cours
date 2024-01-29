package fr.cch;

import fr.cch.exercices.exo1.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();
        context.register(Burger.class, Pain.class, Steak.class, Salade.class, Fromage.class);
        Burger cheeseBurger = context.getBean(Burger.class);
        cheeseBurger.composer();

    }

}
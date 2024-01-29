package fr.cch.exercices.exo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MainComponent {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainComponent.class);
        BurgerComponent cheeseBurger = context.getBean(BurgerComponent.class);
        cheeseBurger.composer();

    }
}

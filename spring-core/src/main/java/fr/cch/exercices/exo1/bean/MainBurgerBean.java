package fr.cch.exercices.exo1.bean;

import fr.cch.exercices.exo1.Burger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBurgerBean {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBurger.class);
        context.getBean(Burger.class);

    }
}

package fr.cch.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MainComponent {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainComponent.class);
        VoitureComponent dacia = context.getBean(VoitureComponent.class);
        dacia.rouler();

    }
}

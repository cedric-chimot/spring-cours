package fr.cch.exercices.exo1.bean;

import fr.cch.exercices.exo1.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBurger {

    @Bean
    public Burger burger() { return new Burger(newPain(), newSteak(), newSalade(), newFromage()); }

    @Bean
    public Pain newPain() { return new Pain(); }
    @Bean
    public Steak newSteak() { return new Steak(); }
    @Bean
    public Salade newSalade() { return new Salade(); }
    @Bean
    public Fromage newFromage() { return new Fromage(); }

}

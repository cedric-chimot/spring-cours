package fr.cch.bean;

import fr.cch.Moteur;
import fr.cch.Voiture;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Voiture voiture() {
        return new Voiture(moteur());
    }

    @Bean
    public Moteur moteur() {
        return new Moteur();
    }

}

package fr.cch.calculatrice.service;

import fr.cch.calculatrice.entity.Calculatrice;
import org.springframework.stereotype.Service;

@Service
public class CalculatriceService {
    public int addition(int a, int b) {

        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public int calcul(Calculatrice calculatrice) {
        return switch (calculatrice.getOperation()) {
            case "+" -> addition(calculatrice.getNb1(), calculatrice.getNb2());
            case "-" -> soustraction(calculatrice.getNb1(), calculatrice.getNb2());
            case "*" -> multiplication(calculatrice.getNb1(), calculatrice.getNb2());
            case "/" -> division(calculatrice.getNb1(), calculatrice.getNb2());
            case "%" -> modulo(calculatrice.getNb1(), calculatrice.getNb2());
            default -> 0;
        };
    }

}

package fr.cch.calculatrice.controller;

import fr.cch.calculatrice.entity.Calculatrice;
import fr.cch.calculatrice.service.CalculatriceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculatrice")
public class CalculatriceController {

    private final CalculatriceService calculatriceService;

    public CalculatriceController(CalculatriceService calculatriceService) {
        this.calculatriceService = calculatriceService;
    }

    @PostMapping("/addition")
    public int addition(@RequestParam int a, int b) {
        return calculatriceService.addition(a, b);
    }

    @PostMapping("/multiplication")
    public int multiplication(@RequestParam int a, int b) {
        return calculatriceService.multiplication(a, b);
    }

    @PostMapping("/division")
    public int division(@RequestParam int a, int b) {
        return calculatriceService.division(a, b);
    }

    @PostMapping("/soustraction")
    public int soustraction(@RequestParam int a, int b) {
        return calculatriceService.soustraction(a, b);
    }

    @PostMapping("/modulo")
    public int modulo(@RequestParam int a, int b) {
        return calculatriceService.modulo(a, b);
    }

    @PostMapping("/calcul")
    public int calcul(@RequestBody Calculatrice calculatrice) {
        return calculatriceService.calcul(calculatrice);
    }
}

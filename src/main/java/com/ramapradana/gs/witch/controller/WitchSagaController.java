package com.ramapradana.gs.witch.controller;

import com.ramapradana.gs.witch.models.Person;
import com.ramapradana.gs.witch.models.Witch;
import com.ramapradana.gs.witch.request.AverageVictimRequest;
import com.ramapradana.gs.witch.utils.AverageVictimCalculator;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WitchSagaController {
    private static final AverageVictimCalculator CALCULATOR = new AverageVictimCalculator(new Witch());

    @GetMapping("/witch")
    public String index() {
        return "index";
    }

    @PostMapping(value="/witch", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE}, produces = {MediaType.TEXT_HTML_VALUE})
    public String calculate(AverageVictimRequest request, Model model) {
        Person p1 = new Person(request.getAgesOfDeath()[0], request.getYearsOfDeath()[0]);
        Person p2 = new Person(request.getAgesOfDeath()[1], request.getYearsOfDeath()[1]);

        float result = CALCULATOR.calculate(List.of(p1, p2));

        model.addAttribute("p1", p1);
        model.addAttribute("p2", p2);
        model.addAttribute("result", result);

        return "index";
    }
}

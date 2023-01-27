package com.ramapradana.gs.witch.utils;

import com.ramapradana.gs.witch.models.Person;
import com.ramapradana.gs.witch.models.Witch;
import java.util.List;

public class AverageVictimCalculator {
    private final Witch witch;

    public AverageVictimCalculator(Witch witch) {
        this.witch = witch;
    }

    public float calculate(List<Person> people){
        float personKilled = 0;

        for (Person p : people) {
            if (!p.isValid()) {
                return -1;
            }

            personKilled += this.witch.getNumberOfVictimInYear(p.getYearOfBirth());
        }

        return personKilled / people.size();
    }
}

package com.ramapradana.gs.witch.utils;

import com.ramapradana.gs.witch.models.Person;
import com.ramapradana.gs.witch.models.Witch;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AverageVictimCalculatorTest {
    static AverageVictimCalculator CALCULATOR;

    @BeforeAll
    static void BeforeAll() {
        CALCULATOR = new AverageVictimCalculator(new Witch());
    }

    @Test
    void calculateTest() {
        Person p1 = new Person(10, 12);
        Person p2 = new Person(13, 17);

        assertEquals(4.5, CALCULATOR.calculate(List.of(p1, p2)));
    }

    @Test
    void whenPersonInvalid_shouldReturnNegativeOne() {
        Person p1 = new Person(10, 9);
        Person p2 = new Person(13, 17);

        assertEquals(-1, CALCULATOR.calculate(List.of(p1, p2)));
    }
}

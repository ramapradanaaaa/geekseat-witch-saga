package com.ramapradana.gs.witch.models;

import com.ramapradana.gs.witch.utils.Fibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WitchTest {

    @Test
    void shouldReturnNumberOfVillagerKilledInFibonacciTerms() {
        Witch w = new Witch();
        Fibonacci f = new Fibonacci();

        int year = 10;
        assertEquals(f.sumNumber(year), w.getNumberOfVictimInYear(year));
    }
}

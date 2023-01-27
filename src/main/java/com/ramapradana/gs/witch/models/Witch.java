package com.ramapradana.gs.witch.models;

import com.ramapradana.gs.witch.utils.Fibonacci;

public class Witch {
    private static final Fibonacci FIBONACCI = new Fibonacci();

    public int getNumberOfVictimInYear(int year) {
        return FIBONACCI.sumNumber(year);
    }
}

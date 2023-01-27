package com.ramapradana.gs.witch.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    static Fibonacci f;

    @BeforeAll
    static void beforeAll() {
        f = new Fibonacci();
    }
    @Test
    void getNumberTest() {
        assertEquals(1, f.getNumber(1));
        assertEquals(1, f.getNumber(2));
        assertEquals(2, f.getNumber(3));
        assertEquals(3, f.getNumber(4));
        assertEquals(13, f.getNumber(7));
        assertEquals(21, f.getNumber(8));
    }

    @Test
    void sumNumberTest() {
        assertEquals(1, f.sumNumber(1));
        assertEquals(7, f.sumNumber(4));
        assertEquals(12, f.sumNumber(5));
    }
}

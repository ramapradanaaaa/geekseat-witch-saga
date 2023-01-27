package com.ramapradana.gs.witch.utils;

public class Fibonacci {

    public int getNumber(int index) {
        if (index <= 1) return index;
        int value = 1, previousValue = 1;
        for (int i = 2; i < index; i++) {
            int temp = value;
            value += previousValue;
            previousValue = temp;
        }

        return value;
    }

    public int sumNumber(int lastIndex) {
        int result = 0;
        for (int i = 1; i <= lastIndex; i++) {
            result += this.getNumber(i);
        }

        return result;
    }
}

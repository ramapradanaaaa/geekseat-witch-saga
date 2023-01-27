package com.ramapradana.gs.witch.models;

import com.ramapradana.gs.witch.models.Person;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void personShouldHaveAgeOfDeath() {
        Person p = new Person();
        int ageOfDeath = 12;
        p.setAgeOfDeath(ageOfDeath);

        assertEquals(ageOfDeath, p.getAgeOfDeath());
    }

    @Test
    void personShouldHaveYearOfDeath() {
        Person p = new Person();
        int yearOfDeath = 10;
        p.setYearOfDeath(yearOfDeath);

        assertEquals(yearOfDeath, p.getYearOfDeath());
    }

    @Test
    void personShouldAbleToGetBirthYear(){
        int ageOfDeath = 10;
        int yearOfDeath = 17;

        Person p = new Person(ageOfDeath, yearOfDeath);

        assertEquals(7, p.getYearOfBirth());
    }

    @Test
    void whenYearOfBirthIsLessThenZero_shouldReturnNegativeOne() {
        int ageOfDeath = 10;
        int yearOfDeath = 5;

        Person p = new Person(ageOfDeath, yearOfDeath);

        assertEquals(-1, p.getYearOfBirth());
    }

    @Test
    void whenBornOnTheSameYearWithWitch_shouldReturnZero() {
        int ageOfBirth = 10;

        Person p = new Person(ageOfBirth, ageOfBirth);

        assertEquals(0, p.getYearOfBirth());
    }

    @Test
    void whenAgeOfDeathIsNegative_shouldBeInvalid() {
        Person p = new Person();
        p.setAgeOfDeath(-1);

        assertFalse(p.isValid());
    }

    @Test
    void whenYearOfDeathIsNegative_shouldBeInvalid() {
        Person p = new Person();
        p.setYearOfDeath(-1);

        assertFalse(p.isValid());
    }

    @Test
    void whenYearOfBirthIsNegative_shouldBeInvalid() {
        Person p = new Person(10, 8);
        assertFalse(p.isValid());
    }
}

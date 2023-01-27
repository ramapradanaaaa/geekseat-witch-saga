package com.ramapradana.gs.witch.models;

import com.ramapradana.gs.witch.Validate;

public class Person implements Validate {
    private int ageOfDeath;

    private int yearOfDeath;

    public Person() {}

    public Person(int ageOfDeath, int yearOfDeath) {
        this.ageOfDeath = ageOfDeath;
        this.yearOfDeath = yearOfDeath;
    }

    public int getAgeOfDeath() {
        return ageOfDeath;
    }

    public void setAgeOfDeath(int ageOfDeath) {
        this.ageOfDeath = ageOfDeath;
    }

    public int getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    public int getYearOfBirth() {
        int yearOfBirth = this.yearOfDeath - this.ageOfDeath;
        return yearOfBirth < 0 ? -1 : yearOfBirth;
    }

    @Override
    public boolean isValid() {
        return !(this.ageOfDeath < 0 || this.yearOfDeath < 0 || this.getYearOfBirth() < 0);
    }
}

package com.ramapradana.gs.witch.request;

public class AverageVictimRequest {
    private int[] agesOfDeath;

    private int[] yearsOfDeath;

    public int[] getAgesOfDeath() {
        return agesOfDeath;
    }

    public void setAgesOfDeath(int[] agesOfDeath) {
        this.agesOfDeath = agesOfDeath;
    }

    public int[] getYearsOfDeath() {
        return yearsOfDeath;
    }

    public void setYearsOfDeath(int[] yearOfDeath) {
        this.yearsOfDeath = yearOfDeath;
    }
}

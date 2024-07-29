package com.example.pbouas2;

import android.content.Context;

public abstract class RaceCar {
    private String teamName;
    private int maxSpeed;

    public RaceCar(String teamName, int maxSpeed) {
        this.teamName = teamName;
        this.maxSpeed = maxSpeed;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void displayInfo(Context context);
    public abstract void startRace(Context context);
}

package com.example.pbouas2;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;

public class LeMansCar extends RaceCar {
    private String engineType;

    public LeMansCar(String teamName, int maxSpeed, String engineType) {
        super(teamName, maxSpeed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void displayInfo(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("LeMans Car Info");
        builder.setMessage("Team: " + getTeamName() + "\nMax Speed: " + getMaxSpeed() + " km/h\nEngine Type: " + engineType);
        builder.setPositiveButton("OK", null);
        builder.show();
    }

    @Override
    public void startRace(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Race Started");
        builder.setMessage(getTeamName() + " LeMans car is starting the race with engine " + engineType);
        builder.setPositiveButton("OK", null);
        builder.show();
    }
}
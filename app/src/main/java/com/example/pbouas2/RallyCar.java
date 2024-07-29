package com.example.pbouas2;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;

public class RallyCar extends RaceCar {
    private String terrainType;

    public RallyCar(String teamName, int maxSpeed, String terrainType) {
        super(teamName, maxSpeed);
        this.terrainType = terrainType;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    @Override
    public void displayInfo(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Rally Car Info");
        builder.setMessage("Team: " + getTeamName() + "\nMax Speed: " + getMaxSpeed() + " km/h\nTerrain Type: " + terrainType);
        builder.setPositiveButton("OK", null);
        builder.show();
    }

    @Override
    public void startRace(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Race Started");
        builder.setMessage(getTeamName() + " Rally car is starting the race on " + terrainType + " terrain");
        builder.setPositiveButton("OK", null);
        builder.show();
    }
}
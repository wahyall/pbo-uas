package com.example.pbouas2;

import android.content.Context;

public class RaceCarManager {
    public void displayRaceCarInfo(RaceCar raceCar, Context context) {
        raceCar.displayInfo(context);
    }

    public void startRace(RaceCar raceCar, Context context) {
        raceCar.startRace(context);
    }
}
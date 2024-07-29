package com.example.pbouas2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RaceCar formulaOneCar;
    private RaceCar rallyCar;
    private RaceCar leMansCar;
    private RaceCarManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formulaOneCar = new FormulaOneCar("Red Bull Racing", 350, "Honda RBPTH002");
        rallyCar = new RallyCar("Hyundai Motorsport", 220, "Gravel");
        leMansCar = new LeMansCar("Porsche GT Team", 320, "LMP3");

        manager = new RaceCarManager();

        Button btnFormulaOne = findViewById(R.id.btnFormulaOne);
        Button btnRallyCar = findViewById(R.id.btnRallyCar);
        Button btnLeMansCar = findViewById(R.id.btnLeMansCar);

        btnFormulaOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.displayRaceCarInfo(formulaOneCar, MainActivity.this);
                manager.startRace(formulaOneCar, MainActivity.this);
            }
        });

        btnRallyCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.displayRaceCarInfo(rallyCar, MainActivity.this);
                manager.startRace(rallyCar, MainActivity.this);
            }
        });


        btnLeMansCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.displayRaceCarInfo(leMansCar, MainActivity.this);
                manager.startRace(leMansCar, MainActivity.this);
            }
        });
    }
}

package com.conversionic.metrique;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton notes = findViewById(R.id.notes);
      notes.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this, Currencies.class);
              startActivity(intent);
          }
      });
        ImageButton len = findViewById(R.id.len);
        len.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, length.class);
                startActivity(intent);
            }
        });
        ImageButton speeds = findViewById(R.id.speeds);
        speeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, speed.class);
                startActivity(intent);
            }
        });
        ImageButton areas = findViewById(R.id.areas);
        areas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Area.class);
                startActivity(intent);
            }
        });
        ImageButton temps = findViewById(R.id.temps);
        temps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, temperature.class);
                startActivity(intent);
            }
        });
        ImageButton weights = findViewById(R.id.weights);
        weights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, weight.class);
                startActivity(intent);
            }
        });
        TextView currency = findViewById(R.id.currency);
        currency.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Currencies.class);
            startActivity(intent);
        });
        TextView speed = findViewById(R.id.speed);
        speed.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, speed.class);
            startActivity(intent);
        });
        TextView weight = findViewById(R.id.weight);
        weight.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, weight.class);
            startActivity(intent);
        });
        TextView tempe = findViewById(R.id.tempe);
        tempe.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, temperature.class);
            startActivity(intent);
        });
        TextView length = findViewById(R.id.length);
        length.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, length.class);
            startActivity(intent);
        });
        TextView area = findViewById(R.id.area);
        area.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Area.class);
            startActivity(intent);
        });
    }


}
package com.example.program10;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner citySpinner;
    private TextView selectionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citySpinner = findViewById(R.id.citySpinner);
        selectionText = findViewById(R.id.selectionText);

        // Spinner data
        String[] cities = {"Select a city", "New York", "London", "Tokyo", "Paris", "Sydney"};

        // Adapter for Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, cities);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        citySpinner.setAdapter(adapter);

        // Event handling: when user selects a city
        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCity = cities[position];
                if (position != 0) {  // Ignore default item
                    Toast.makeText(MainActivity.this, "You selected: " + selectedCity, Toast.LENGTH_SHORT).show();
                    selectionText.setText("Selected City: " + selectedCity);
                } else {
                    selectionText.setText("Selected City: None");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Optional: Handle case when nothing is selected
            }
        });
    }
}

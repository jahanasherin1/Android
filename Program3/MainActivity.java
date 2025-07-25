package com.example.prgrm3_calculator;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText number1EditText;
    private EditText number2EditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1EditText = findViewById(R.id.editTextText);
        number2EditText = findViewById(R.id.editTextText2);
        resultTextView = findViewById(R.id.textView);

        findViewById(R.id.button6).setOnClickListener(v -> Calculation('+'));
        findViewById(R.id.button8).setOnClickListener(v -> Calculation('-'));
        findViewById(R.id.button).setOnClickListener(v -> Calculation('*'));
        findViewById(R.id.button7).setOnClickListener(v -> Calculation('/'));
    }

    private void Calculation(char operator) {
        try {
            double num1 = Double.parseDouble(number1EditText.getText().toString());
            double num2 = Double.parseDouble(number2EditText.getText().toString());
            double result = 0;

            // This is a traditional switch statement, which works in Java 11
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            resultTextView.setText(String.valueOf(result));

        } catch (NumberFormatException e) {
            // This single catch block handles both empty and invalid number inputs
            Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
        }
    }
}
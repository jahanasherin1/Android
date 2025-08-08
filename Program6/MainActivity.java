package com.example.program6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText editTextText,editTextText2,editTextText3;
    RadioButton radioButton,radioButton2;
     CheckBox checkBox;
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking UI controls
        editTextText=findViewById(R.id.editTextText);
        editTextText2=findViewById(R.id.editTextText2);
        editTextText3=findViewById(R.id.editTextText3);
        radioButton=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.button);

    //set button click listener
    button.setOnClickListener(new View.OnClickListener(){
     @Override
        public void onClick(View view){
            validateForm();
        }
        });
    }

    private void validateForm(){
     //Name validation
         if (TextUtils.isEmpty(editTextText.getText().toString())){
         editTextText.setError("Name is required");
         return;
         }
    //email validation
    if(!Patterns.EMAIL_ADDRESS.matcher(editTextText2.getText().toString()).matches()){
        editTextText2.setError("Enter a valid email");
        return;
    }
        // Password Validation
        if (editTextText3.getText().toString().length() < 6) {
            editTextText3.setError("Password must be at least 6 characters");
            return;
        }
        // Gender Validation
        if (!radioButton.isChecked() && !radioButton2.isChecked()) {
            Toast.makeText(this, "Select your gender", Toast.LENGTH_SHORT).show();
            return;
        }
        // Terms Checkbox Validation
        if (!checkBox.isChecked()) {
            Toast.makeText(this, "Please accept Terms & Conditions", Toast.LENGTH_SHORT).show();
            return;
        }
        // If all validations pass
        Toast.makeText(this, "Form Submitted Successfully!", Toast.LENGTH_LONG).show();
    }

    }
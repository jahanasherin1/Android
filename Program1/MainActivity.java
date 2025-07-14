package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        EditText editTextTextPassword=findViewById(R.id.editTextTextPassword);
        EditText uname=findViewById(R.id.editTextText2);
        final String username="Jahana";
        final String password="jahana@123";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextTextPassword.getText().toString().equals("jahana@123") && uname.getText().toString().equals("Jahana"))
                    Toast.makeText(MainActivity.this,"login sucessfully",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"login failed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
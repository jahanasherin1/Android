package com.example.program3;

import static androidx.fragment.app.FragmentManager.TAG;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String TAG="ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn;
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                butOnClick();
            }
        });
        Log.d(TAG,"oncreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }
    private void butOnClick(){
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity is about to become visible");
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"onResume:Activity has become visible(It is now resumed)");
        Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause:Another activity taking focus(this activity about to be paused)");
        Toast.makeText(this,"OnPause",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onStop:Activity is no longer visible(it is now stopped)");
        Toast.makeText(this,"OnStop",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart:Activity is being restarted after being stopped");
        Toast.makeText(this,"OnRestart",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy:Activity is about to be destroyed");
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_SHORT).show();

    }
}
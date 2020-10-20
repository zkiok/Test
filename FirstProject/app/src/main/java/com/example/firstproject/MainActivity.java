package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button app1 = (Button)findViewById(R.id.App1);
        Button app2 = (Button)findViewById(R.id.App2);
        Button app3 = (Button)findViewById(R.id.App3);
        Button app4 = (Button)findViewById(R.id.App4);

        app2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), ActivityApp2.class);
                startActivity(startIntent);
            }
        });

        app1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), ActivityApp1.class);
                startActivity(startIntent);
            }
        });
    }
}
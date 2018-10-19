package com.example.wfg.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class navigation extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);


        button = (Button) findViewById(R.id.destination);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(navigation.this, showMap.class);
                startActivity(intent);
            }
        });

        button1 = (Button) findViewById(R.id.washroom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(navigation.this, showMap.class);
                startActivity(intent1);
            }
        });

        button2 = (Button) findViewById(R.id.foodpoint);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(navigation.this, showMap.class);
                startActivity(intent2);
            }
        });
    }
}



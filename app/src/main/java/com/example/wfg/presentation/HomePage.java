package com.example.wfg.presentation;

import android.support.v7.app.AppCompatActivity;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private Button button;
    private Button button1,CallSecurity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, CameraActivity.class);
                startActivity(intent);
            }
        });

        CallSecurity = (Button) findViewById(R.id.CallSecurity);
        CallSecurity.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, callSecurity.class);
                startActivity(intent);
            }
        });
        button1 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}

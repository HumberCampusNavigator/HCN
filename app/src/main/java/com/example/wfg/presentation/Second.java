package com.example.wfg.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra("ExtraMessage");
        TextView textView = findViewById(R.id.displayMessage);
        textView.setText(message);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        if (menuItem.getItemId() == R.id.Settings){
            Toast.makeText(this, "You clicked Settings", Toast.LENGTH_SHORT).show();
        }
        else if (menuItem.getItemId() == R.id.quit){
            finish();
        }
        return super.onOptionsItemSelected(menuItem);


    }

    public void returnFunction(View view){
        finish();
    }
}

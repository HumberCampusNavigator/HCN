package com.example.wfg.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
    public void sendMessage(View view)    {
        EditText editText = findViewById(R.id.message);
        EditText editText1 = findViewById(R.id.textView2);


        String message1 = editText1.getText().toString()+"\n"+editText.getText().toString();

        Intent intent1 = new Intent(HomeActivity.this,Second.class);
        intent1.putExtra("ExtraMessage",message1);
        startActivity(intent1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }
}

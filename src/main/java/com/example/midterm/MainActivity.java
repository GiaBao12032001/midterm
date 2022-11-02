package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchtoinfo();
            }
        });
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void ClickFavorite(View view) {
        displayToast(getString(R.string.favorite));
    }
    public void ClickCall(View view) {
        displayToast(getString(R.string.call));
    }
    private void switchtoinfo() {
        Intent switchInfoIntent = new Intent(this, NhaThoDucBaActivity.class);
        startActivity(switchInfoIntent);
    }


}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void reg(View view) {
        Intent intent = new Intent(getBaseContext(),Register.class);
        startActivity(intent);
    }

    public void card(View view) {
        Intent intent = new Intent(getBaseContext(),cards.class);
        startActivity(intent);
    }
}
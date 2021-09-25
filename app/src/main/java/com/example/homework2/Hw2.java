package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Hw2 extends AppCompatActivity {
    TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw2);

        v = (TextView) findViewById(R.id.textView);
        Intent i = getIntent();

        v.setText("Hello, "+ i.getStringExtra("personName"));

    }
}
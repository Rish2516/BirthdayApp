package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView wish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wish=findViewById(R.id.wish);
        Intent intent=getIntent();
        String display=intent.getStringExtra("com.example.birthdayapp.extra");
        wish.setText("Happy Birthday "+ display+ "\n" +

                "Wishing you a very special birthday and a great year to come! Happy birthday to my absolute best friend, whom I care for and cherish the most! I hope your birthday will be full of sunshine and rainbows and joy and happiness! Sending you lots of good wishes and happy vibes on your special day.");
    }
}
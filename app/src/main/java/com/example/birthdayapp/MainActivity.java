package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Happy Birthday", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String name=editText.getText().toString();
                intent.putExtra("com.example.birthdayapp.extra",name);
                startActivity(intent);
            }
        });
    }
}
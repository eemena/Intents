package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this,Actividad2.class);
        intent.putExtra("VariableString", "Esta es una String");
        intent.putExtra("VariableINT", 666);
        startActivity(intent);
    }
}

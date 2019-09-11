package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        Bundle datos = this.getIntent().getExtras();
        String frase = datos.getString("VariableString");
        int entero = datos.getInt("VariableINT");

        TextView texto = findViewById(R.id.Caja);
        texto.setText("Estas son los valores enviados: " + frase + " " + entero);

    }
}

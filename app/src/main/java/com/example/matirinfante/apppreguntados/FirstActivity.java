package com.example.matirinfante.apppreguntados;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    Button correcto, incorrecto, siguiente;
    static int puntaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        correcto = findViewById(R.id.btn_correcto);
        incorrecto = findViewById(R.id.btn_incorrecto);
        siguiente = findViewById(R.id.btn_siguiente);

        puntaje = 0; //Variable inicializada
    }

    public void clickCorrecto(View v){
        correcto.setBackgroundColor(Color.GREEN);
        correcto.setEnabled(false);
        incorrecto.setEnabled(false);
        siguiente.setVisibility(View.VISIBLE);
        this.puntaje += 1; // puntaje = puntaje + 1;
    }

    public void clickIncorrecto(View v){
        incorrecto.setBackgroundColor(Color.RED);
        correcto.setEnabled(false);
        incorrecto.setEnabled(false);
        siguiente.setVisibility(View.VISIBLE);
    }

    public void clickSiguiente(View v){
        startActivity(new Intent(FirstActivity.this, SecondActivity.class).putExtra("puntaje",this.puntaje));
    }
}

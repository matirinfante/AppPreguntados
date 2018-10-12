package com.example.matirinfante.apppreguntados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    static int puntaje;
    TextView textPuntaje, textDescripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        textPuntaje = findViewById(R.id.textPuntaje);
        textDescripcion = findViewById(R.id.textDescripcion);

        //Se obtiene el puntaje.
        Intent anterior = getIntent();
        this.puntaje = anterior.getIntExtra("puntaje",0);
        this.generar();
    }

    private void generar(){
        //Genera un texto personalizado según el puntaje. Como son dos preguntas en este ejemplo, MAX = 2 y MIN = 0
        switch (this.puntaje){
            case 2: textPuntaje.setText(Integer.toString(this.puntaje));
                    textDescripcion.setText("Puntaje perfecto!");
                    break;
            case 0: textPuntaje.setText(Integer.toString(this.puntaje));
                    textDescripcion.setText("Volvé a intentarlo");
                    break;
            default: textPuntaje.setText(Integer.toString(this.puntaje));
                     textDescripcion.setText("Bien!");

        }
    }
}

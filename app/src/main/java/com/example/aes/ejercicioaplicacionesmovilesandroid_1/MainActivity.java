package com.example.aes.ejercicioaplicacionesmovilesandroid_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button calculadora,paises,creditos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calculadora=(Button)findViewById(R.id.buttonCalculadora);
        paises=(Button)findViewById(R.id.buttonPaises);
        creditos=(Button)findViewById(R.id.buttonCreditos);

        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Calculadora.class);
                startActivity(i);
            }
        });


        paises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Paises_Sudamerica.class);
                startActivity(i);
            }
        });

        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),Creditos.class);
                startActivity(i);
            }
        });


    }
}

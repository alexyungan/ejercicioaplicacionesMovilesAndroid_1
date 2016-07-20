package com.example.aes.ejercicioaplicacionesmovilesandroid_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {
 EditText exitValor1,exitValor2;
    TextView resultado;
    Button buttonCalcular,Salir;
    Spinner operacion;
    int operacionSelec=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        Salir=(Button)findViewById(R.id.buttonSalirCalculadora);
        resultado=(TextView)findViewById(R.id.textViewrestultadoCal) ;
        exitValor1 =(EditText)findViewById(R.id.editTextValor1);
        exitValor2 =(EditText)findViewById(R.id.editTextValor2);
        buttonCalcular=(Button)findViewById(R.id.buttonCalcularOperacion);
        operacion=(Spinner)findViewById(R.id.spinnerOperaciones);
          String[] item = new String[]{"suma","Resta","Multipliacion","Divicion"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,item);

        operacion.setAdapter(adapter);

        operacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                operacionSelec=i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a = Integer.parseInt( exitValor1.getText().toString());
                int b =Integer.parseInt( exitValor2.getText().toString());
                int Res=0;
                switch (operacionSelec){
                    case 0:

                        Res=a+b;
                        break ;
                    case 1:
                        Res=a-b;


                        break ;
                    case 2:
                        Res=a*b;

                        break ;
                    case 3:
                        Res=a/b;

                        break ;
                }

                resultado.setText(Integer.toString(Res));


            }
        });

        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }



}

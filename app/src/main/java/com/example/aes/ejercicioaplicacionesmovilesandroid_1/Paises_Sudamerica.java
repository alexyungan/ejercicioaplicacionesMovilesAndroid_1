package com.example.aes.ejercicioaplicacionesmovilesandroid_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aes.ejercicioaplicacionesmovilesandroid_1.Myclases.AdaptadorPais;
import com.example.aes.ejercicioaplicacionesmovilesandroid_1.Myclases.Pais;

import java.util.ArrayList;

public class Paises_Sudamerica extends AppCompatActivity {
  ListView listViewPais;
    TextView poblacion;
    Button salir;
    ArrayList<Pais> lista =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises__sudamerica);
        listViewPais=(ListView)findViewById(R.id.listViewPaises);
        salir=(Button)findViewById(R.id.buttonSalirPaises_SUdamerica);
        poblacion=(TextView)findViewById(R.id.textPoblacionOptenida);
        Pais p1=new Pais("5000","Ecuador");
        Pais p2=new Pais("10000","Peru");
        Pais p3=new Pais("8000","Bolivia");
        Pais p4=new Pais("403000","Brazil");
        Pais p5=new Pais("5000","Argentina");
        Pais p6=new Pais("230000","Paraguay");
        Pais p7=new Pais("1000","Perú");
        Pais p8=new Pais("400000","Uruguay");
        Pais p9=new Pais("1000","Venezuela");
        Pais p10=new Pais("40000","Colombia ");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);

        AdaptadorPais adaptadorPais =new AdaptadorPais(this,lista);
        listViewPais.setAdapter(adaptadorPais);

       listViewPais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

              // String PoblacionSelec=((TextView)view.findViewById(android.R.id.text1)).getText().toString();

               poblacion.setText(lista.get(i).getPoblacion());

           }
       });

  salir.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          finish();
      }
  });


    }
}

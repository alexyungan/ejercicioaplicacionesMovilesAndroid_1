package com.example.aes.ejercicioaplicacionesmovilesandroid_1.Myclases;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Aes on 19/7/2016.
 */
public class AdaptadorPais extends ArrayAdapter<Pais> {


    public AdaptadorPais(Context context, ArrayList<Pais> resource) {
        super(context, 0,resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Pais p = getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);

        }

        TextView descripcion=(TextView)convertView.findViewById(android.R.id.text1);
        descripcion.setText(p.getNombre());


        return  convertView;
    }
}

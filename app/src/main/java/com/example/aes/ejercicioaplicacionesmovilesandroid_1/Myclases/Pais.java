package com.example.aes.ejercicioaplicacionesmovilesandroid_1.Myclases;

/**
 * Created by Aes on 19/7/2016.
 */
public class Pais {
    private  String Poblacion;

    private  String Nombre;

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String poblacion) {
        Poblacion = poblacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Pais(String poblacion, String nombre) {
        Poblacion = poblacion;
        Nombre = nombre;
    }
}

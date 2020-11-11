package com.company;

public class Cinema {
    private String nom;
    private int numSales;
    private Pelicula[] pelicules;

    public Cinema(String nom, int numSales, Pelicula[] pelicules){
        this.nom=nom;
        this.numSales=numSales;
        this.pelicules=pelicules;
    }

    public Pelicula peliculaMesLlarga(){
        Pelicula pelicula=new Pelicula("a", 0, "a");
        for(int i=0;i<pelicules.length;i++){
            if(pelicules[i].getDuracio()>pelicula.getDuracio()){
                pelicula=pelicules[i];
            }
        }
        return pelicula;
    }
}

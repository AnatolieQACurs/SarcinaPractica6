package com.company.topic8;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte lumeaSeDestrama = new Carte(" Lumea Se Destrama ", " Chinua Achebe ", 566464, 568);
        Carte sufleteMoarte = new Carte(" Suflete moarte ", " Nikolai Gogal ", 568464, 541);
        Carte fluturi = new Carte(" Fluturi ", " Irina Binder ", 562114, 6988);


        Stoc magazinulCentru = new Stoc(2, " ASEM ");
        Stoc magazinulRascani = new Stoc(5, "PanCom");

        magazinulCentru.adougaCtarea(lumeaSeDestrama);
        magazinulCentru.adougaCtarea(sufleteMoarte);
        magazinulRascani.adougaCtarea(fluturi);

        System.out.println();
        System.out.println(" Cartile din magazinul de la ASEM sunt " + magazinulCentru.numarDeCartiInStoc());
        System.out.println();
        System.out.println(" Cartile din magazinul de la PanCom sunt " + magazinulRascani.numarDeCartiInStoc());
        System.out.println();

        magazinulCentru.stergeCrateaDinStoc(lumeaSeDestrama);
        System.out.println(" Cartile din magazinl centru au fost sterse " + magazinulCentru.numarDeCartiInStoc());
        System.out.println();

        magazinulCentru.afiseazaCartileDinStoc();
        System.out.println(magazinulCentru.stocEpuizat());
        System.out.println("Stoc epuizat");
    }
}

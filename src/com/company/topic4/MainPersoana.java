package com.company.topic4;

public class MainPersoana {
    public static void main(String[] args) {
        //Exemplu Copil
        Persoana vasileStrusca = new Persoana(" Vasile Strusca", 7);
        vasileStrusca.afiseazaVarstaSiCategoriaPersoanei();
        //Exemplu Adolescent
        Persoana anatolieProdan = new Persoana("Anatolie Prodan", 17);
        anatolieProdan.afiseazaVarstaSiCategoriaPersoanei();
        //Exemplu Matur
        Persoana elenaRusu = new Persoana("Elena Rusu", 37);
        elenaRusu.afiseazaVarstaSiCategoriaPersoanei();
        //Exemplu Varstnic
        Persoana stefanBersan = new Persoana("Stefan Bersan",67);
        stefanBersan.afiseazaVarstaSiCategoriaPersoanei();
    }
}

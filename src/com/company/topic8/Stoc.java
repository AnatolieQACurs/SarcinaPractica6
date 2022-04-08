package com.company.topic8;

import java.util.ArrayList;
import java.util.List;

public class Stoc {
    public Stoc(int stocIdAtribuit, String adresaMagazinAtribuit) {
        stocId = stocIdAtribuit;
        adresaMagazin = adresaMagazinAtribuit;
        cartileDinStoc = new ArrayList<>();
    }
    private int stocId;
    private String adresaMagazin;
    List<Carte> cartileDinStoc;

    public void adougaCtarea(Carte carteaAdugata) {
        this.cartileDinStoc.add(carteaAdugata);
        System.out.println(carteaAdugata.toString() + "A fost adaugata in stoc " + stocId + " adresa " + adresaMagazin);
    }

    public void stergeCrateaDinStoc(Carte cartePeCareOStergem) {
        boolean carteaAFostStearsa = this.cartileDinStoc.remove(cartePeCareOStergem);
        if (carteaAFostStearsa) {
            System.out.println(cartePeCareOStergem.toString() + "A fost stearse " + stocId + " , de la adresa " + adresaMagazin);
        } else
            System.out.println("Stergera nu a avut loc");
    }

    public boolean existaCarteaInMagazin(Carte carteInvestigata) {
        return this.cartileDinStoc.contains(carteInvestigata);
    }

    public int numarDeCartiInStoc() {
        return this.cartileDinStoc.size();
    }

    public boolean stocEpuizat() {
        return this.cartileDinStoc.isEmpty();
    }

    public void afiseazaCartileDinStoc() {
        System.out.println(this.cartileDinStoc);
    }
}


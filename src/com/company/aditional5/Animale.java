package com.company.aditional5;

public abstract class Animale {
    private boolean vegetarian;
    private String mananca;
    private int picioare;

    public Animale(){}
    public Animale( boolean veg,String man, int pic ){
        this.vegetarian = veg;
        this.mananca = man;
        this.picioare = pic;
    }
    public boolean esteVegetarian(){
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getMananca() {
        return mananca;
    }

    public void setMananca(String mananca) {
        this.mananca = mananca;
    }

    public int getPicioare() {
        return picioare;
    }

    public void setPicioare(int picioare) {
        this.picioare = picioare;
    }
}

package com.company.topic5;

public abstract class FiguraGeometrica {
    protected double aria;
    protected double perimetrul;

    public abstract double returneazaAria();
    public abstract double returneazaPerimetrul();

    public double getAria() {
        return aria;
    }

    public void setAria(double aria) {
        this.aria = aria;
    }

    public double getPerimetrul() {
        return perimetrul;
    }

    public void setPerimetrul(double perimetrul) {
        this.perimetrul = perimetrul;
    }
}

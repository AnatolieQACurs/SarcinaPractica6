package com.company.topic5;

public class Cerc extends FiguraGeometrica{
    private double raza;

    public void setRaza(double raza) {
        this.raza = raza;
    }
    public double getRaza() {
        return raza;
    }

    @Override
    public double returneazaAria() {
        this.aria = raza * raza * 3.14;
        return this.aria;
    }

    @Override
    public double returneazaPerimetrul() {
        this.perimetrul = 2 * 3.14 * raza;
        return this.perimetrul;
    }
}

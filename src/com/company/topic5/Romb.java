package com.company.topic5;

public class Romb extends FiguraGeometrica {
    double diagonala1;
    double diagonala2;
    double lungimeaLaturilor;

    public double getDiagonala1() {
        return diagonala1;
    }

    public void setDiagonala1(double diagonala1) {
        this.diagonala1 = diagonala1;
    }

    public double getDiagonala2() {
        return diagonala2;
    }

    public void setDiagonala2(double diagonala2) {
        this.diagonala2 = diagonala2;
    }
    public double getLungimeaLaturilor() {
        return lungimeaLaturilor;
    }

    public void setLungimeaLaturilor(double lungimeaLaturilor) {
        this.lungimeaLaturilor = lungimeaLaturilor;
    }

    @Override
    public double returneazaAria() {
        this.aria =  diagonala1 * diagonala2 + 2;
        return aria;
    }

    @Override
    public double returneazaPerimetrul() {
        this.perimetrul = 4 * lungimeaLaturilor;
        return 0;
    }
}

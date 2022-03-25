package com.company.topic5;

public  class Patrat extends FiguraGeometrica {
    private double lungimeLatura;


    public void setLungimeLatura(double lungimeLatura) {
        this.lungimeLatura = lungimeLatura;
    }
    public double getLungimeLatura() {
        return lungimeLatura;
    }

    @Override
    public double returneazaAria() {
        this.aria = lungimeLatura * lungimeLatura ;
        return this.aria;
    }

    @Override
    public double returneazaPerimetrul() {
        this.perimetrul = lungimeLatura * 4;
        return this.perimetrul;
    }
}

package com.company.aditional5;

public class Capre extends Animale{
    protected boolean coarne;
    private  String color;
    private int urechi;

    public Capre( boolean veg, String man, int pic, boolean coarne, String color, int urechi){
        super(veg, man, pic);
        this.coarne=coarne;
        this.color=color;
        this.urechi=urechi;
    }

    public boolean isCoarne() {
        return coarne;
    }

    public void setCoarne(boolean coarne) {
        this.coarne = coarne;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getUrechi() {
        return urechi;
    }

    public void setUrechi(int urechi) {
        this.urechi = urechi;
    }
}

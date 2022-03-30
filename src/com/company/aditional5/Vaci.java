package com.company.aditional5;

public class Vaci extends Animale{
    protected boolean coarne;

    public Vaci( boolean veg, String man, int pic,boolean coarne){
        super(veg, man, pic);
        this.coarne=true;
    }

    public boolean getCoarne() {
        return coarne;
    }

    public void setCoarne(boolean coarne) {
        this.coarne = coarne;
    }
}

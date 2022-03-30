package com.company.aditional5;

public class Caini extends Animale{
    protected String color;

    public Caini ( boolean veg, String man, int pic, String color ){
        super(veg, man, pic);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

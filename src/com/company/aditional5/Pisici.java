package com.company.aditional5;

public class Pisici extends Animale{
    private String color;

    public Pisici(boolean veg, String man, int pic){
        super(veg, man, pic);
        this.color="negra";
    }
    public Pisici(boolean veg, String man, int pic, String color){
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

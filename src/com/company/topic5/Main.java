package com.company.topic5;

public class Main {
    public static void main(String[] args) {
        Cerc cercA = new Cerc();
        Patrat patratB = new Patrat();
        Romb rombC = new Romb();
        //Cerc
        cercA.setRaza(6.2);
        System.out.println( "Aria cercului: " + cercA.returneazaAria());
        cercA.setPerimetrul(62);
        System.out.println( "Perimetrul cercului " + cercA.returneazaPerimetrul());
        System.out.println();
        //Patrat
        patratB.setLungimeLatura(3);
        System.out.println("Aria rombului este " + patratB.returneazaAria());

        patratB.setPerimetrul(6);
        System.out.println("Perimetrul rombului este de " + patratB.returneazaPerimetrul());
        System.out.println();
        //Romb
        rombC.setDiagonala1(3);
        rombC.setDiagonala2(12);
        rombC.returneazaAria();
        System.out.println("Aria rombului " + rombC.getAria());

        rombC.setLungimeaLaturilor(52);
        rombC.returneazaPerimetrul();
        System.out.println("Perimetrul Rombului " + rombC.getPerimetrul());


    }
}

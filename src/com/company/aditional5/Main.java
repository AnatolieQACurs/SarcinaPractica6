package com.company.aditional5;

public class Main {
    public static void main(String[] args) {
        //Metoda scurta pentru vaci
        Vaci vaci = new  Vaci(true,"iarba",4,true);
        System.out.println(" Vacile sunt vegetariene " + vaci.esteVegetarian() + ", consuma " + vaci.getMananca() + " au " + vaci.getPicioare()
        + " picioare, au 2 coarne " + vaci.coarne + ".");
        System.out.println();

        //Metoda lunga pentru Pisici
        Pisici pisici = new Pisici( false, " lapte", 4, "neagra");
        System.out.println(" Pisicile sunt vegetariene? " + pisici.esteVegetarian());
        System.out.println(" Pisicile mananca" + pisici.getMananca() + ".");
        System.out.println(" Pisicile au " + pisici.getPicioare() + " picioare.");
        System.out.println(" In aceasta ferma de animale avem mai multe pisici de culoare " + pisici.getColor() + ".");
        System.out.println();

        //Metoda scurata pentru Capre
        Capre capre = new Capre( true, "iarba",4, true, "alb",2);
        System.out.println(" Caprele sunt vegetariene "+ capre.esteVegetarian() + ", consuma " + capre.getMananca() + " au " +capre.getPicioare() + "piciare, au coarne "
        + capre.coarne + " are culoarea " + capre.getColor() + " are " + capre.getUrechi() +" urechi ");
        System.out.println();

        //Metoda lunga pentru Caini
        Caini caini = new Caini( false, "carne", 4,"beige");
        System.out.println( "Caini sunt vegetarieni " + caini.esteVegetarian());
        System.out.println( "Caini mannca " + caini.getMananca());
        System.out.println( "Caini au  " + caini.getPicioare() + " picioare ");
        System.out.println( "Caini au coloarea " + caini.getColor());

    }
}

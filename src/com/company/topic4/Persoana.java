package com.company.topic4;

public class Persoana {
    public Persoana(String numePrenumeAtribuit, int varstaAtribuit){
        numePrenume = numePrenumeAtribuit;
        varsta = varstaAtribuit;
    }
    String numePrenume;
    int varsta;

    public void afiseazaVarstaSiCategoriaPersoanei(){
        if (varsta < 12){
            System.out.println("Copil");
        }
        else if (varsta < 18){
            System.out.println("Adolescent");
        }
        else if ( varsta < 50){
            System.out.println("Matura");
        }
        else if ( varsta < 100){
            System.out.println("Varstnica");
        }

    }
}

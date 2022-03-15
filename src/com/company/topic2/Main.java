package com.company.topic2;

public class Main {
    public static void main(String[] args) {
        Persona per = new Persona( "Anatolie ", "Prodan",  23,"Masculin", 92.0 );
        per.afisezaInfo();
        per.Prenume = " Elena ";
        per.Nume = " Rusu ";
        per.Varsta = 24 ;
        per.Gen = " Femenin";
        per.setGreutate(65.00);
        per.afisezaInfo();
    }

}

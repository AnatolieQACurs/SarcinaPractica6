package com.company.topic2;

public class Persona {
    String Prenume;
    String Nume;
   protected int Varsta;
    String Gen;
  private double Greutate;

    public double getGreutate() {
        return Greutate;
    }

    public void setGreutate(double greutate) {
        Greutate = greutate;
    }

   public Persona (String Prenume , String Nume, int Varsta, String Gen, double Greutate){
     this.Prenume = Prenume;
     this.Nume = Nume;
     this.Varsta = Varsta;
     this.Gen = Gen;
     this.Greutate = Greutate;

    }

    public void afisezaInfo() {
        System.out.println( "Ma numesc " + Prenume + Nume + ", am varsta de " + Varsta + " sunt de genul masculin " + Gen
                + " am greutatea de " + Greutate );

    }
}

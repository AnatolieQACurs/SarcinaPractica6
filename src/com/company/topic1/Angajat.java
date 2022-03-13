package com.company.topic1;

public class Angajat {
    String nume;
    int varsta;
    Double salariu;
    String gen;

    public Angajat (String nume, int varsta, Double salariu, String gen ){
        this.nume=nume;
        this.varsta=varsta;
        this.salariu=salariu;
        this.gen=gen;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }
    public void setVarsta(){
        this.varsta = varsta;
    }

    public Double getSalariu() {
        return salariu;
    }

    public void setSalariu(Double salariu) {
        this.salariu = salariu;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    void afiseazaInfo(){
        System.out.println("Angajatul cu numele " + getNume() + " are varsta de " + getVarsta()
                +  " ani, angajat in functia de QA primeste un salariu de " + getSalariu() + " MDL, este de gen "
                + getGen() + "." );
    }

}

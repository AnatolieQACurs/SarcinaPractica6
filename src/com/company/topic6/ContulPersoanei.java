package com.company.topic6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ContulPersoanei {

    private String numePersoana;
    private int id;
    private double sumaCurenta;

    public String getNumePersoana() {
        return numePersoana;
    }
    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public void transferCatreOPersona(String directoriulDeDate)  {
        File datePentruTransfer = new File(directoriulDeDate);
        try {
            FileReader fileReader = new FileReader(datePentruTransfer);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Acest cod este rulat ");
        }
    }

}

package com.company.topic6;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContulPersoanei contPersoanei = new ContulPersoanei();
        contPersoanei.transferCatreOPersona("C:\\Users\\Admin\\Desktop\\Tema6\\SarcinaPractica6\\src\\com\\company\\aditional5\\Caini.java");
        contPersoanei.transferCatreOPersona("Directoriu inexistent");

    }
}
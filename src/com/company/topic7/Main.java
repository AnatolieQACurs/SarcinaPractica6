package com.company.topic7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Adresa directoriului
        String adresaFisierului = "C:\\Users\\Admin\\Desktop\\Tema6\\SarcinaPractica6\\src\\com\\company\\topic7\\fisierVechi";

        //String: Scrierea in fisier
        String dateVechi = "Test 1";
        try {
            FileManager.scriereaInformatieTextInFisier(adresaFisierului,dateVechi);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //String: alipirea la fisier
        String dateNoi = "Alte ";
        try {
            FileManager.scriereaInformatieTextInFisier(adresaFisierului, dateNoi);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileManager.alipireaInformatieiTextInFisier(adresaFisierului, "Informatii ");
        FileManager.alipireaInformatieiTextInFisier(adresaFisierului, "Utile ");

        //String: citirea din fisier
        String date2 = FileManager.alipireaInformatieiLaFisier(adresaFisierului);
        System.out.println(date2);
    }
}

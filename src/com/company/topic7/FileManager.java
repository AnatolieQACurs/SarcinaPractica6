package com.company.topic7;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    static void scriereaInformatieTextInFisier(String caleaCatreFisir, String date) throws IOException {
        FileWriter problema = new FileWriter(caleaCatreFisir);
        problema.write(date);
        problema.close();
    }

    static void alipireaInformatieiTextInFisier (String caleaCatreFisir, String date1) {
        FileWriter problema = null;
        try {
            problema = new FileWriter(caleaCatreFisir,true);
            problema.write(date1);
            problema.close();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Problema ");
        }
        finally {
            System.out.println("Blocul se executa la infinit");
        }
    }

    static String alipireaInformatieiLaFisier(String caleaCatreFisier) throws IOException {
            String continutul = Files.readString(Path.of(caleaCatreFisier));
        return continutul;
    }
}

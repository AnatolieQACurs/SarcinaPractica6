package com.company.topic8;

public class Carte {
    public Carte(String titluAtribuit, String autorTitlu, long numarDeSerieAtrinuit, int paginiAtribuit) {
        titlu = titluAtribuit;
        autor = autorTitlu;
        numarDeSerie = numarDeSerieAtrinuit;
        pagini = paginiAtribuit;
    }

    private String titlu;
    private String autor;
    private long numarDeSerie;
    private int pagini;

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", numarDeSerie=" + numarDeSerie +
                '}';
    }
}


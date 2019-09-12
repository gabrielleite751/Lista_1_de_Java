package br.com.cesar.lista1;

import br.com.cesar.lista1.Objetos.Medidas;

public class ExercicioTres {

    public static void main(String[] args) {

        Medidas m = new Medidas("Km", "Kg", "C", 10, 30,60);
        m.converterDistancia(m);
        m.converterMassa(m);
        m.converterTemperatura(m);
    }
}
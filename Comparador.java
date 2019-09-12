package br.com.cesar.lista1.Objetos;

import java.util.*;

public class Comparador {

    public void ordena(ArrayList<Integer> list) {
        Collections.sort(list);

        System.out.println("\nLista Ordenada:\n");
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.printf(" --> %d", list.get(i));
        }

    }

    public void maioresNumeros(ArrayList<Integer> list) {
        int tam = list.size();
        int maior = list.get(tam - 1);
        int segundoMaior = list.get(tam - 2);
        System.out.printf("\nOs dois maiores números são %d e %d!\n", maior,segundoMaior);
    }
}

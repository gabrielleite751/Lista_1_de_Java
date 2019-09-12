package br.com.cesar.lista1;

import br.com.cesar.lista1.Objetos.Comparador;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Comparador com = new Comparador();

        System.out.println("Digite 8 números: ");

        for (int i = 0; i < 8; i++) {
            System.out.print(">>> ");
            list.add(input.nextInt());
        }

        System.out.println("\nLista não Ordenada:\n");
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.printf(" --> %d",list.get(i));
        }
        System.out.print("\n");
        com.ordena(list);
        System.out.print("\n");
        com.maioresNumeros(list);
    }
}

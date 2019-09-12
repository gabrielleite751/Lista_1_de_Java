package br.com.cesar.lista1;

import br.com.cesar.lista1.Objetos.Calculadora;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner scan = new Scanner(System.in);
        int x,y;
        System.out.println("Calculadora:");
        System.out.print(">> ");
        x = scan.nextInt();
        System.out.print(">>> ");
        String resp = scan.next();
        System.out.print(">> ");
        y = scan.nextInt();

        switch (resp) {
            case "+": {
                System.out.println("Resposta:");
                calculadora.soma(x,y);
                break;
            }
            case "-":{
                System.out.println("Resposta:");
                calculadora.subtracao(x,y);
                break;
            }
            case "/":{
                System.out.println("Resposta:");
                calculadora.divide(x,y);
                break;
            }
            case "^":{
                System.out.println("Resposta:");
                calculadora.potencia(x, y);
                break;
            }
            case "*":{
                System.out.println("Resposta:");
                calculadora.produto(x,y);
                break;

            }
            default: {
                System.out.println("Invalid");
                break;
            }
        }
    }
}
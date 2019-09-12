package br.com.cesar.lista1.Objetos;

public class Calculadora {

    public void soma(int a, int b) {
        int soma = a + b;
        System.out.println(soma);
    }

    public void produto(int a, int b){
        int produto = a * b;
        System.out.println(produto);
    }

    public void subtracao(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }

    public void divide(int a, int b) {
        int div = a / b;
        System.out.println(div);
    }

    public void potencia(int a, int b) {
        System.out.println(Math.pow(a,b));
    }
}

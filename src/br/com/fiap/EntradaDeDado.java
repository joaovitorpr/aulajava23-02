package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        int num1 = 0;
        // Declaração de objeto
        Scanner scan;
        //Instanciação de um objeto

        //Também poderia ser feito de tal forma: Scanner scan = new Scanner(System.in)
        try {
            scan = new Scanner(System.in); //System.in: é uma classe que funciona como uma entrada de dados.
            System.out.println("Digita um número ai mano(Um inteiro)");
            num1 = scan.nextInt();
            System.out.println("Você digitou:" + num1);
        } catch (Exception e){
            System.out.println("Formato de número incorreto.");
        }

    }
}

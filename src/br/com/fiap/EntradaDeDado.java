package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, resultado = 0;
        // Declaração de objeto
        Scanner scan;
        //Instanciação de um objeto

        //Também poderia ser feito de tal forma: Scanner scan = new Scanner(System.in)
        try {
            scan = new Scanner(System.in); //System.in: é uma classe que funciona como uma entrada de dados.
            System.out.println("Digita um número ai mano(Um inteiro)");
            num1 = scan.nextInt();
            System.out.println("Digite outro número inteiro mano");
            num2 = scan.nextInt();
            resultado = num1 + num2;
            System.out.println("Valor 1:" + num1 + "\nValor 2:" + num2 + "\nA somatoria é:" + resultado);
        } catch (Exception e){
            System.out.println("Formato de número incorreto.");
        }

    }
}

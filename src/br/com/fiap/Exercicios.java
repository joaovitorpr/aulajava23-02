package br.com.fiap;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        float prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0, resultado = 0;

        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o valor das 4 provas");
            prova1 = scan.nextFloat();
            prova2 = scan.nextFloat();
            prova3 = scan.nextFloat();
            prova4 = scan.nextFloat();
            resultado = (prova1 + prova2 + prova3 + prova4) / 4;
            System.out.println("Nota1:" + prova1 + "\nNota2:" + prova2 + "\nNota3:" + prova3 + "\nNota4:" + prova4 + "\nO valor aritmetico é:" + resultado);

        } catch (Exception e) {
            System.out.println("Informação incorreta");
        }
    }
}

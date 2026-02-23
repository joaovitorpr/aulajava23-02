package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class Exercicios {
    //Exercícios 1
//    public static void main(String[] args) {
//        float prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0, resultado = 0;
//
//        try{
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Digite o valor das 4 provas");
//            prova1 = scan.nextFloat();
//            prova2 = scan.nextFloat();
//            prova3 = scan.nextFloat();
//            prova4 = scan.nextFloat();
//            resultado = (prova1 + prova2 + prova3 + prova4) / 4;
//            System.out.println("Nota1:" + prova1 + "\nNota2:" + prova2 + "\nNota3:" + prova3 + "\nNota4:" + prova4 + "\nO valor aritmetico é:" + resultado);
//
//        } catch (Exception e) {
//            System.out.println("Informação incorreta");
//        }
//    }
//}
//public static void main(String[] args) {
//    float prova1, prova2, prova3, prova4, resultado;
//    String auxiliar;
//    try{
//        auxiliar = JOptionPane.showInputDialog("Digite o valor da 1° prova");
//        prova1 = Float.parseFloat(auxiliar);
//        auxiliar = JOptionPane.showInputDialog("Digite o valor da 2° prova");
//        prova2 = Float.parseFloat(auxiliar);
//        auxiliar = JOptionPane.showInputDialog("Digite o valor da 3° prova");
//        prova3 = Float.parseFloat(auxiliar);
//        auxiliar = JOptionPane.showInputDialog("Digite o valor da 4° prova");
//        prova4 = Float.parseFloat(auxiliar);
//        resultado = (prova1 + prova2 + prova3 + prova4) / 4;
//        JOptionPane.showMessageDialog(null,"A média é:" + resultado);
//    } catch (Exception e) {
//        JOptionPane.showMessageDialog(null,"Informação incorreta");
//    }
//}
    //Exercício 2
//   public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int anoAtual = 0, anoNacimento = 0, idade = 0;
//        try {
//            System.out.println("Insirá o ano atual");
//            anoAtual = scan.nextInt();
//            System.out.println("insirá o ano de seu nascimento");
//            anoNacimento = scan.nextInt();
//            idade = anoAtual - anoNacimento;
//            System.out.println("Sua idade atual é:" + idade);
//        } catch (Exception e) {
//            System.out.println("Dado inválido");
//        }
//   }
//    public static void main(String[] args) {
//        int anoAtual, anoNascimento, idade;
//        String auxiliar;
//        try {
//            auxiliar = JOptionPane.showInputDialog("Digite o ano atual");
//            anoAtual = Integer.parseInt(auxiliar);
//            auxiliar = JOptionPane.showInputDialog("Digite o ano de seu nascimento");
//            anoNascimento = Integer.parseInt(auxiliar);
//            idade = anoAtual - anoNascimento;
//            JOptionPane.showMessageDialog(null,"Sua idade é:" + idade + "anos");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null,"Informação inválida");
//        }
//    }
    //Exercício 3
//    public static void main(String[] args) {
//        double raio, areaDoCirculo;
//        Scanner scan = new Scanner(System.in);
//        try {
//            System.out.println("Digite o raio do circulo");
//            raio = scan.nextDouble();
//            areaDoCirculo = Math.PI * Math.pow(raio, 2);
//            System.out.println("A área do circulo é:" + areaDoCirculo);
//
//        } catch (Exception e) {
//            System.out.println("Não é um número ou a informação está incorreta");
//        }
//    }
//    public static void main(String[] args) {
//        double raio, areaDoCirculo;
//        String auxiliar;
//        try {
//            auxiliar = JOptionPane.showInputDialog("Digite o raio do circulo");
//            raio = Double.parseDouble(auxiliar);
//            areaDoCirculo = Math.PI * Math.pow(raio, 2);
//            JOptionPane.showMessageDialog(null, "O raio do circulo é:" + areaDoCirculo);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null,"Informação incorreta");
//        }
//    }
}

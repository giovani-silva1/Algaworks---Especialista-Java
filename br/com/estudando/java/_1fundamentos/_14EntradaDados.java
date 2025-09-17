package br.com.estudando.java._1fundamentos;

import java.util.Scanner;

public class _14EntradaDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua Altura");
        double alturaDigitado = sc.nextDouble();

        System.out.println("Digite seu peso");
        double pesoDigitado = sc.nextDouble();

        sc.nextLine();
        System.out.println("Digite seu Nome:");
        String nomeDigitado = sc.nextLine();


        double imcCalculado =  pesoDigitado / (alturaDigitado * alturaDigitado);
        System.out.printf("O usuario com o nome: %s , contem o seguinte imc: %f",nomeDigitado,imcCalculado);

    }
}

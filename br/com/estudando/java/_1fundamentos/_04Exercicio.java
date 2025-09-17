package br.com.estudando.java._1fundamentos;

import java.util.Scanner;

public class _04Exercicio {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite o valor da primeira venda");
        int valorVenda1 = sc.nextInt();

        System.out.println("Digite o valor da segunda venda");
        int valorVenda2 = sc.nextInt();

        System.out.println("Digite o valor da terceira venda");
        int valorVenda3 = sc.nextInt();

        int mediaValores = ((valorVenda1 + valorVenda2 + valorVenda3) / 3);

        System.out.println("Média de valores:" + mediaValores);



    }
}

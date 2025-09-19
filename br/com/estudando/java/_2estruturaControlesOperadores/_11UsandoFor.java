package br.com.estudando.java._2estruturaControlesOperadores;

import java.util.Scanner;

public class _11UsandoFor {
    public static void main(String[] args) {
        controlePesoAeronave();
    }

    public static void controlePesoAeronave() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade Passageiros");
        int quantidadePassageiros = scanner.nextInt();

        System.out.println("Peso total da Aeronave");
        int pesoTotalAeronave = scanner.nextInt();


        int pesoPassageirosSomado = 0;
        for (int i = 1; i < quantidadePassageiros; i++) {
            System.out.printf("Digite o peso do passageiro #%d ", i);
            int pesoPassageiro = scanner.nextInt();
            pesoPassageirosSomado += pesoPassageiro;
        }

        System.out.println("O Peso maximo da aeronave é :" + pesoTotalAeronave);
        System.out.println("O valor do peso de todos passageiros é:" + pesoPassageirosSomado);
        System.out.printf("Aeronave pode Decolar?: %s%n", (pesoPassageirosSomado > pesoTotalAeronave) ? "PESO EXCEDIDO" : "LIBERADA");

        scanner.close();

    }
}

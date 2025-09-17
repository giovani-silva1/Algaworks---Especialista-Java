package br.com.estudando.java._2estruturaControlesOperadores;

import java.util.Scanner;

public class _04ExercicioAnoBissextosOperadores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano que deseja saber se é bissexto");
        int ano = scanner.nextInt();

        boolean isBissextoOpcao1 = ano %400 == 0;
        boolean isBissextoOpcao2 =  ano % 4 == 0 && ano%100 !=0;

        boolean isBissexto = isBissextoOpcao1 || isBissextoOpcao2;
        boolean notBissexto = !isBissextoOpcao1 && !isBissextoOpcao2;

        System.out.println("Esta ano é bissexto:" + isBissexto);
        System.out.println("Este ano não é bissexto:" + notBissexto);
    }
}

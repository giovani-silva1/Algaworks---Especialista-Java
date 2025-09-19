package br.com.estudando.java._2estruturaControlesOperadores;

import java.util.Scanner;

// a partir do java 14
public class _08SwitchExpressions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        String diaSemana = sc.nextLine();
        String horarioFuncionamento = "";
        switch (diaSemana) {
            case "seg" -> horarioFuncionamento = "FECHADO";
            case "ter","qua" -> horarioFuncionamento = "ABERTO";
            case "qui","sex" -> horarioFuncionamento = "ABERTO";
            case "sab","dom" -> horarioFuncionamento = "FECHADO";

        }
    }
}

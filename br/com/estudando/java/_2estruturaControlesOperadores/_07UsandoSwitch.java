package br.com.estudando.java._2estruturaControlesOperadores;

import java.util.Scanner;

public class _07UsandoSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da sua nota");
        int notaFinalDigitada = sc.nextInt();

        String descricaoNota = "";
        switch (notaFinalDigitada){
            case 1:
                descricaoNota = "Nota muito ruim";
                break;
            case 2:
                descricaoNota = "Ruim";
                break;
            case 3:
                descricaoNota = "Media";
            case 4:
                descricaoNota = "Boa";
                break;
            case 5:
                descricaoNota = "Nota Máxima";
                break;
            default:
                descricaoNota = "Nota não encontrada";





        }
        System.out.println("Descricao Nota:" +descricaoNota);
        sc.close();
    }

}

package br.com.estudando.java._2estruturaControlesOperadores;

public class _09Ternario {

    public static void main(String[] args) {

        double valorFaturado = 1200.00;

        char tipoNota = 'P';

        double totalFaturado = tipoNota =='P' ? (valorFaturado * 0.16) : (valorFaturado * 0.35);

        System.out.println("total faturado : " + totalFaturado);

    }
}

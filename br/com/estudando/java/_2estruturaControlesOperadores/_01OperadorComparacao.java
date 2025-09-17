package br.com.estudando.java._2estruturaControlesOperadores;

public class _01OperadorComparacao {

    public static void main(String[] args) {

        int pesoCarga = 1000;

        int pesoSuportadoCargueiro = 900;

        int idade = 15;

        int idadePermitidaBalada = 18;

        boolean cargaExcedida = pesoCarga > pesoSuportadoCargueiro;
        boolean acessoLiberadoBalada = idade <= idadePermitidaBalada;

        System.out.println("Carga Excedida:" + cargaExcedida);
        System.out.println("Ele pode entrar na balada:" + acessoLiberadoBalada);

    }
}

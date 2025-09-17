package br.com.estudando.java._2estruturaControlesOperadores;

public class _03OperadoresLogicos {

    public static void main(String[] args) {

        //cliente vai na festa do branco na qual precisa ter idade >= 18 e estar vestido de roupa branca


        int idadeCliente = 17;
        String corRoupa = "Branca";

        boolean podeEntrarExclusivo = idadeCliente >= 18 && corRoupa.equals("Branca");
        boolean podeEntrarAlternativo = idadeCliente >= 18 ||  corRoupa.equals("Branca");

        System.out.println("Este cliente pode entrar:" + podeEntrarExclusivo);
        System.out.println("Este cliente pode entrar:" + podeEntrarAlternativo);


    }
}

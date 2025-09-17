package br.com.estudando.java._2estruturaControlesOperadores;

public class _02OperadoresIgualdadeNeg {
    public static void main(String[] args) {

        boolean numerosIguais = 10 == 10;

        System.out.println("Numeros iguais:" + numerosIguais);

        int primeiroNumero = 10;
        int segundoNumero = 20;

        boolean numerosAcimaIguais = (primeiroNumero == segundoNumero);
        boolean numerosDiferentes = !numerosAcimaIguais;

        String nomePrimeiro = "Thiago";
        String nomeSegundo = "Thiago";


        //Ajuste com Equals
        boolean nomesComparacao = nomePrimeiro == nomeSegundo;


        System.out.println("NumerosAcimaIguais?:" + numerosAcimaIguais);
        System.out.println("NumerosAcimaDiferentes?:" + numerosDiferentes);
        System.out.println("Nomes Comparação:" + nomesComparacao);

    }
}

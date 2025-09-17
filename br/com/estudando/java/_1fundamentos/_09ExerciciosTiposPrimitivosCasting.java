package br.com.estudando.java._1fundamentos;

public class _09ExerciciosTiposPrimitivosCasting {
    public static void main(String[] args) {

        double pesoCarga1 = 1033.49;
        double pesoCarga2 = 849.88;

        int pesoTotalCarga = (int) (pesoCarga1 + pesoCarga2);

        System.out.println("Peso total das cargas: " + pesoTotalCarga);
    }
}

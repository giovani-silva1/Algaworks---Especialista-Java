package br.com.estudando.java._1fundamentos;

public class _08CastingTiposPrimitivos {
    public static void main(String[] args) {


        // tipo maior para tipo menor
        long x = 10;

        // estou confirmando que pode fazer a conversão.
        int y = (int) x;



        //cast implicita pois o long é maior que int
        int h = 10;
        long g = h;
    }
}

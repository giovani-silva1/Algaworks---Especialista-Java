package br.com.estudando.java._2estruturaControlesOperadores;


import java.util.Scanner;

public class _05UsandoIF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double pesoDigitado = sc.nextDouble();

        System.out.println("Digite sua altura");
        double alturaDigitada = sc.nextDouble();

        double imcCalculado = pesoDigitado / (alturaDigitada * alturaDigitada);


        if(imcCalculado < 18.5) {
            System.out.println("Abaixo do peso ideal");
        }

        else if(imcCalculado >=18.5 && imcCalculado <= 25){
            System.out.println("Peso Ideal");
        }
        else if(imcCalculado >=25 && imcCalculado < 30){
            System.out.println("Acima do Peso");
        }

        else if(imcCalculado >=30 && imcCalculado < 35){
            System.out.println("Obesidade I");
        }

        else if(imcCalculado >=35 && imcCalculado < 40){
            System.out.println("Obesidade II");
        }
        else if(imcCalculado >40){
            System.out.println("Obesidade III");
        }

        sc.close();
    }

}

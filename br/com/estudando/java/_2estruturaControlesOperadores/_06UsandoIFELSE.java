package br.com.estudando.java._2estruturaControlesOperadores;

import java.util.Scanner;

public class _06UsandoIFELSE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu peso");
        double pesoDigitado = sc.nextDouble();

        System.out.println("Digite a sua altura");
        double altura = sc.nextDouble();
        System.out.println("Digite o seu sexo");
        char sexoDigitado = sc.next().charAt(0);

        double imcCalculado = pesoDigitado / (altura * altura);
        boolean isMulher = sexoDigitado =='F';

        if(isMulher){
            if(imcCalculado <19.1){
                System.out.println("Abaixo do peso");
            }else if(imcCalculado >=19.1 &&  imcCalculado <=25.8 ){
                System.out.println("No Peso Ideal");
            }else if(imcCalculado >=25.9 &&  imcCalculado <=27.3){
                System.out.println("Um pouco acima do peso");
            }else if(imcCalculado >=27.4 &&  imcCalculado <=32.3){
                System.out.println("Acima do peso ideal");
            }else if(imcCalculado >=32.3){
                System.out.println("Obeso");
            }
        }else{
            if(imcCalculado <20.7){
                System.out.println("Abaixo do peso");
            }else if(imcCalculado >=20.8 &&  imcCalculado <=26.4 ){
                System.out.println("No Peso Ideal");
            }else if(imcCalculado >=26.5 &&  imcCalculado <=27.8){
                System.out.println("Um pouco acima do peso");
            }else if(imcCalculado >=27.9 &&  imcCalculado <=31.1){
                System.out.println("Acima do peso ideal");
            }else if(imcCalculado >=31.1){
                System.out.println("Obeso");
            }
        }

    }
}

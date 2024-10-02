package Modulo2P1;

//Clasificacion por indice de masa corporal

import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura * altura);
        System.out.println("Tu IMC es " + imc);

        if( imc < 18.5 ){
            System.out.println("Tiene bajo peso");
        }else if( imc>= 18.5 && imc < 24.9 ){
            System.out.println("Tu peso es normal");
        }else if( imc >= 25 && imc < 29.9){
            System.out.println("Tiene sobre peso");
        }else{
            System.out.println("Es hora de ver al médico");
        }

    }
}

package Modulo2P1;

//Comparacion de 3 numeros

import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitar 3 numeros
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();

        if( num1 > num2 && num1 > num3 ){
            System.out.println("El primer numero es el mayor");
        }else if( num2 > num1 && num2 > num3 ){
            System.out.println("El segungo numero es el mayor");
        }else{
            System.out.println("El tercer numero es el mayor");
        }
    }
}

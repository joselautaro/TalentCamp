package Modulo2P1;

//Estación del año

import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero del mes (1-12): ");
        int mes  = scanner.nextInt();

        if( mes == 12 || mes == 1 || mes == 2 ){
            System.out.println("Es verano");
        }else if( mes >= 3 && mes <= 5 ){
            System.out.println("Es otoño");
        }else if( mes >= 6 && mes <= 8 ){
            System.out.println("Es invierno");
        }else if( mes >= 9 && mes <= 11 ){
            System.out.println("Es primera");
        }else{
            System.out.println("Mes invialido");
        }

    }
}

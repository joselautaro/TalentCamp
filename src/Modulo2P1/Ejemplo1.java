package Modulo2P1;

//Verificación de edad para votar

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicitar edad
        System.out.print("Ingrese la edad");
        int edad = scanner.nextInt();

        //Verificar si es mayor de 18
        if( edad >= 18 ){
            System.out.println("Es mayor de 18");
        }else{
            System.out.println("No tienes edad suficiente para votar");
        }
    }
}

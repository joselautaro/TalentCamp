package Modulo2P1;

//Convertimos diferentes unidades de medida segun la opcion ingresada por el usuario

import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una conversion: ");
        System.out.println("1. Kilometros a millas");
        System.out.println("2. Libras a kilogramos");
        System.out.println("3. Litros a galones");

        //Leer al opcion del usuario
        int opcion = sc.nextInt();
        double resultado = 0;

        switch(opcion ){
            case 1:
                System.out.print("Ingrese la cantidad de kilometros: ");
                double km = sc.nextDouble(); //Conversion a millas
                resultado = km * 0.621371;
                System.out.println(km + " kilometros son " + resultado + " millas.");
                break;
            case 2:
                System.out.print("Ingrese la cantidad de libras: ");
                double libras = sc.nextDouble();
                resultado = libras * 0.453592; //Conversion a kilogramos
                System.out.println(libras + " libras son " + resultado + " kilogramos.");
                break;
            case 3:
                System.out.print("Ingrese la cantidad de litros: ");
                double litros = sc.nextDouble();
                resultado = litros * 0.264172;
                System.out.println(litros + " litros son " + resultado + " galones.");
                break;
            default:
                System.out.println("Opcion invalida");
        }

    }
}

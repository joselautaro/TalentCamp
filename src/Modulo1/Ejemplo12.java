package Modulo1;

//Conversion de kilometros a millas

import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitar la distancia en kilometros
        System.out.print("Ingrese la distancia en kilometros: ");
        double km = sc.nextDouble();

        //Convertir kilometros a millas
        double millas = km * 0.621371;

        System.out.println(km + " kilometros son " + millas  + " millas.");
    }
}

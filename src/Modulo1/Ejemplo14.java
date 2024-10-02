package Modulo1;
//ingreso de una letra

import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char letra = sc.next().charAt(0);

        System.out.println("La letra que ingresaste es: " + letra);

    }
}

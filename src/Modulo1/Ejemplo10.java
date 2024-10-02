package Modulo1;

//Multiplicacion de decimales
import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero decimal: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero decimal: ");
        double numero2 = sc.nextDouble();

        double resultado = numero1 * numero2;
        System.out.println("El resultado es: " + resultado);

    }
}

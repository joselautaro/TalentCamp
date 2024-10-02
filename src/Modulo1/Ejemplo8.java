package Modulo1;

//Conversion de temperatura (celsius a fahrenheit)
import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        //Convertir a fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " grados celsius son " + fahrenheit + " grados fahrenheit.");
    }
}

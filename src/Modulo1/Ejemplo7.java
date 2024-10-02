package Modulo1;

//Calculo del area de un circulo
import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitar el radio
        System.out.print("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        //Calcular el area
        double area = Math.PI * radio * radio;

        System.out.println("El calculo del circulo es: " + area);

    }
}

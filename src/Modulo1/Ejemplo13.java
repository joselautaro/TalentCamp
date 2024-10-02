package Modulo1;

//Calcular el indice de masa corporal (imc)
import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitar el peso en kilometros
        System.out.print("Ingrese tu peso en kilogramos: ");
        double peso = sc.nextDouble();

        //Solicitar la altura en metros
        System.out.print("Ingrese tu altura en metros: ");
        double altura = sc.nextDouble();

        //Calcular el IMC
        double imc = peso / (altura * altura);

        System.out.println("Tu indice de masa corporal es: " + imc);
    }
}

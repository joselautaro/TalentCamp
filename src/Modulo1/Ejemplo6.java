package Modulo1;

//Importamos la libreria
import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        //Scanner: Libreria
        //scanner: método
        //new: un nuevo objeto
        //Scanner: nombre del nuevo objeto
        //(System.in): utilizamos simbolo de sistema para el ingreso de datos mediante consola
        Scanner scanner = new Scanner(System.in);

        //Solicitar un nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        //Solitar una edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + ". Tiene " + edad + " años.");
    }
}

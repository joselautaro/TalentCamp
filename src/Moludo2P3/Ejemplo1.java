package Moludo2P3;

import java.util.Scanner;

// Calculo de promedios con notas

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;

        int cantidad;

        int contador = 0;

        System.out.print("Cuantas notas deseas ingresar?");
        cantidad = scanner.nextInt();

        while(contador < cantidad){
            System.out.println("Ingrese la nota " + (contador +1) + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
            contador++;
        }

        // Calcular el promedio
        double promedio = suma / cantidad;

        System.out.println("El promedio de las notas es: " + promedio);
        scanner.close();
    }
}

package Modulo2P3;

import java.util.Scanner;

// Busqueda de un numero en un array ingresado por el usuario

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros deseas ingresar?");

        int cantidad = scanner.nextInt();

        int [] numeros = new int[cantidad];

        for( int i = 0; i < cantidad; i ++ ){
            System.out.print("Ingresa el numero " + (i +1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Que numeros deseas buscar?");
        int  buscar = scanner.nextInt();

        int i = 0;

        boolean encontrado = false;

        while( i < cantidad && !encontrado){
            if( numeros[i] == buscar){
                encontrado = true;
            }
            i++;
        }
        if(encontrado){
            System.out.println("Numero encontrado en la posición " + (i -1));
        }else{
            System.out.println("Numero no encontrado");
        }
        scanner.close();
    }
}

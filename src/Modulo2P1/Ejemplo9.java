package Modulo2P1;


import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        if( precio > 100 ){
            precio *= 0.9; //Descuento del 10%
            System.out.println("Se aplicó un descuento del 10%");
        }else if( precio > 50){
            precio *= 0.95;
            System.out.println("Se aplicó un descuento del 5%");
        }else{
            System.out.println("No se aplicó descuento");
        }
        //Mostrar el precio final
        System.out.println("El precio final es de $" + precio);
    }
}

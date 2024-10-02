package Modulo2P1;

//Determinar el tipo de triangulo (equilatero isosceles o escaleno)

import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la longitud del primer lado");
        double lado1 = sc.nextDouble();

        System.out.print("Ingresa la longitud del segundo lado");
        double lado2 = sc.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado");
        double lado3 = sc.nextDouble();

        if( lado1 == lado2 && lado2 == lado3){
            System.out.println("El trigulo es equilatero");
        }else if( lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("El quadrado es isosceles");
        }else{
            System.out.println("El quadrado es escaleno");
        }
    }
}

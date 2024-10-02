package Modulo2P1;

//Caja registradora

import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args) {

        double saldo = 0.0;

        Scanner sc = new Scanner(System.in);

        //Menu de opciones para el user

        System.out.println("--- Menu ---");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Consultar saldo");
        System.out.println("Elegir una opción: ");
        int opcion = sc.nextInt();

        switch ( opcion){
            case 1:
                //Ingreso de dinero
                System.out.print("Ingrese la cantidad de dinero: ");
                double ingreso = sc.nextDouble();
                if( ingreso > 0 ){
                    saldo += ingreso;
                    System.out.println("Has ingresado $ " + ingreso + " correctamente");
                }else{
                    System.out.println("La cantidad debe ser mayor a 0");
                }
            case 2:
                //Retiro de dinero
                System.out.print("Ingrese la cantidad de dinero a retirar: ");
                double retiro = sc.nextDouble();
                if( retiro > 0){
                    if( retiro <= saldo ){
                        saldo -= retiro;
                        System.out.println("Has retirado $" + retiro + " correctamente");
                    }else{
                        System.out.println("Saldo insuficiente para retirar $" + retiro);
                    }
                }else{
                    System.out.println("La cantidad debe ser mayor a cero");
                }
                break;
            case 3:
                //Consulta de saldo
                System.out.print("Tu saldo actual es $" + saldo);
                break;
            default:
               //Opcion no valida
               System.out.println("Opcion no valida");
        }
        sc.close();
    }
}

package Modulo2P2;

import java.util.Scanner;

// Bucle que pide un numero hasta que sea positivo

public class Ejemplo16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int numero;
    
        do{
            System.out.print("Introduce un numero positivo: ");
            numero = sc.nextInt();
        }while(numero <=0);

        System.out.println("Numero valido: " + numero);
        sc.close();
    }
    
}

package Modulo2P1;

//Clasificion de temperaturas
import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura");
        int temperatura = scanner.nextInt();

        if(temperatura < 0){
            System.out.println("hace mucho frio");
        }else if(temperatura <= 18){
            System.out.println("Está fresco");
        }else if(temperatura <= 30){
            System.out.println("Hace calor");
        }

    }
}

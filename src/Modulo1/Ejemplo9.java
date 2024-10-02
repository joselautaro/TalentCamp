package Modulo1;

//ingreso de una frase
import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        //Mostrar la frase

        System.out.println("La frase que ingresaste es: \n" + frase);
    }

}

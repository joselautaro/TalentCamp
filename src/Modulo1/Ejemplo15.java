package Modulo1;
//Conversion de entero a cadena
import java.util.Scanner;
public class Ejemplo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();

        String numeroComoCadena = Integer.toString(numero);

        System.out.println("El numero como cadena es: " + numeroComoCadena);
    }
}

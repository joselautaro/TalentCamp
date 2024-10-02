package Modulo2P2;

//While que suma numeros hasta que la suma sea mayor que 100

public class Ejemplo13 {
    public static void main(String[] args) {
        int suma = 0;
        int numero = 1;

        while( suma <= 100 ){
            suma += numero;
            numero++;
        }
        System.out.println("La suma es: " + suma);
    }
}

package Modulo2P2;

//Array de primitivos

public class Ejemplo5 {
    public static void main(String[] args) {
        //Declaracion de un array de enteros con 5 elementos
        int [] numeros = {1, 2, 3, 4, 5};

        //Acceder a cada uno e imprimirlos
        for(int i = 0; i < numeros.length; i++){
            System.out.println("elemento en posicion " + i + ": " + numeros[i]);
        }
        numeros[2] = 10;
        System.out.println("Nuevo valor en la posicion 2: "+numeros[2]);
        for(int i = 0; i < numeros.length; i++){
            System.out.println("elemento en posicion " + i + ": " + numeros[i]);
        }
    }
}

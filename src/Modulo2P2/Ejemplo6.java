package Modulo2P2;

//Array de string

public class Ejemplo6 {
    public static void main(String[] args) {
        //Declaracion de un array de enteros con 5 elementos
        String [] nombres = {"Juan", "Maria", "Carlos"};

        //Acceder a cada uno e imprimirlos
        for(int i = 0; i < nombres.length; i++){
            System.out.println("elemento en posicion " + i + ": " + nombres[i]);
        }
        nombres[2] = "Santiago";
        System.out.println("Nuevo valor en la posicion 2: "+nombres[2]);
        for(int i = 0; i < nombres.length; i++){
            System.out.println("elemento en posicion " + i + ": " + nombres[i]);
        }
    }
}

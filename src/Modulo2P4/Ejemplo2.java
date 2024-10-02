package Modulo2P4;

public class Ejemplo2 {
    
    static int numeroEstatico = 50;

    public static void main(String[] args) {
        System.out.println("Valor estático: " + numeroEstatico);

        numeroEstatico = 100;

        System.out.println("Nuevo valor estático: " + numeroEstatico);
    }
}

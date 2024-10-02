package Modulo2P2;

public class Ejemplo4 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Bienvenido");

        builder.append(" al mundo de java");

        //Invertir el contenido
        builder.reverse();
        System.out.println("Despues del reverse: " + builder);

        //Version restaurada
        builder.reverse();
        System.out.println("Restaurado: " + builder);

    }
}

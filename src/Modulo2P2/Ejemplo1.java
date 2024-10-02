package Modulo2P2;

public class Ejemplo1 {
    public static void main(String[] args) {
        //Manipulacion de strings

        String saludo = "Hola Mundo";

        //obtener la longitud
        int longitud = saludo.length();
        System.out.println(longitud);

        //Convertir este string en todo mayusculas
        String mayusculas = saludo.toUpperCase();
        System.out.println(mayusculas);

        String reemplazo = saludo.replace("Mundo", "Java");
        System.out.println("Reemplazo: " + reemplazo);
    }
}

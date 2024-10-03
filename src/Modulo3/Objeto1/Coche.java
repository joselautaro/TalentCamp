package Modulo3.Objeto1;

public class Coche {

    // Atributos == Caracteristicas
    double velocidad;

    String color;

    int numeroDePuertas;

    // Método principal de la clase pública
    public static void main(String[] args){
        // Creamos un objeto de la clase "Coche"
        Coche coche1 = new Coche();

        // Asignamos valores
        coche1.velocidad = 250;

        coche1.color = "Rojo";

        coche1.numeroDePuertas = 5;

        System.out.println("Marca: " + coche1.velocidad);
        System.out.println("Color: " + coche1.color);
        System.out.println("Número de puertas: " + coche1.numeroDePuertas);
    }

}
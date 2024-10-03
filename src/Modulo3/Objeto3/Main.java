package Modulo3.Objeto3;

import javax.swing.*;

public class Main {

    // Método main
    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo();

        // Solicitar al usuario ingresar la base
        rectangulo1.base = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la base del rectangulo: "));

        rectangulo1.altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la altura del rectangulo: "));

        System.out.println("El area del rectangulo es: " + rectangulo1.calcularArea());
        System.out.println("El perimetros del rectangulo es: " + rectangulo1.calcularPerimetro());

    }
    
}

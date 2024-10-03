package Modulo3.Objeto8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Botella botella1 = new Botella();

        botella1.capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la capacidad total del agua"));

        botella1.cantidadActual = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad total del agua"));
    
        System.out.println("Faltan " + botella1.calcularAguaFaltante() + "litros para llenar la botella.");
    }
    
}

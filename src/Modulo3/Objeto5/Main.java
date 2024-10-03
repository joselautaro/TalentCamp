package Modulo3.Objeto5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        
        Tiempo tiempo1 = new Tiempo();

        // Solicitamos al user ingresar los segundos totales
        tiempo1.segundosTotales = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de segundos"));

        JOptionPane.showMessageDialog(null, "Tiempo Total: "
        + tiempo1.calcularHoras() + " horas, "
        + tiempo1.calcularMinutos() + " minutos, "
        + tiempo1.calcularSegundos() + " segundos." );
    }
}

package Modulo3.Objeto4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.capital = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital: "));
        cuenta1.tasaInteres = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de interes: "));
        cuenta1.anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo: "));

        System.out.println("El interes simple es: " + cuenta1.calcularInteres());
    }
}

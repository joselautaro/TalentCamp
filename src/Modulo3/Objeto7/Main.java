package Modulo3.Objeto7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Silla silla1 = new Silla();

        silla1.material = JOptionPane.showInputDialog("Ingresa el material de la silla: ");
        silla1.plegable =  JOptionPane.showInputDialog("¿Es plagable? (si/no)").equalsIgnoreCase("si");

        JOptionPane.showMessageDialog(null, silla1.infoSilla());
    }
    
}

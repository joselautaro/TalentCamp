package Modulo2P1;

//Verificar si un numero es par o impar

import javax.swing.JOptionPane;

public class Ejemplo2 {
    public static void main(String[] args) {

            String numeroString = JOptionPane.showInputDialog("Escriba un numero");

            int numero = Integer.parseInt(numeroString);

            if( numero % 2 == 0 ){
                JOptionPane.showMessageDialog(null, "El número es par");
            }else{
                JOptionPane.showMessageDialog(null, "El número es impar");
            }

    }
}

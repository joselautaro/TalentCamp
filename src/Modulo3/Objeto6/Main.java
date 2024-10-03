package Modulo3.Objeto6;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        // Instanciamos el objeto
        Lampara lampara1 = new Lampara();
    
        lampara1.encendida = false; //Inicialmente apagada

        JOptionPane.showMessageDialog(null, "La lampara está " + lampara1.estadoLampara());

        lampara1.cambiarEstado();

        JOptionPane.showMessageDialog(null, "La lampara ahora está " + lampara1.estadoLampara());

    }


    
}

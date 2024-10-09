package Modulo4.InterDispositivosElectronicos;

import javax.swing.*;

import Modulo4.InventarioDeElectrodomesticos.Lavadora;
import Modulo4.InventarioDeElectrodomesticos.Microondas;
import Modulo4.InventarioDeElectrodomesticos.Refrigerador;

public class SistemaDispositivo {
    

    public static void main(String[] args) {
        int numeroDispositivos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos dispositivos quiere agregar?"));

        Dispositivo [] dispositivos = new Dispositivo[numeroDispositivos];

        for(int i = 0; i < numeroDispositivos; i++){
            String tipo = JOptionPane.showInputDialog("¿Que dispositivo es? (televisor/celular/computadora)");

            if( tipo.equalsIgnoreCase("televisor")){
                // Pedimos los detalles del refri
                String marca = JOptionPane.showInputDialog("Ingresa la marca del televisor: ");

                dispositivos[i] = new Televisor(marca);

            } else if( tipo.equalsIgnoreCase("celular")){
                String modelo = JOptionPane.showInputDialog("Ingresa el modelo del celular: ");

                
                dispositivos[i] = new Celular(modelo);
            }else if( tipo.equalsIgnoreCase("computadora") ){
                String tipoCompu = JOptionPane.showInputDialog("Ingresa el tipo de computadora: (desktop/laptop)");

                dispositivos[i] = new Computadora(tipoCompu);
               
            }
        }

        for( Dispositivo dispositivo : dispositivos){
            dispositivo.encender();
            dispositivo.apagar();
            System.out.println();
        }
        
    }


}

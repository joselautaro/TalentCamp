package Modulo4.InventarioDeElectrodomesticos;

import javax.swing.*;

public class SistemaElectrodomesticos {
    
    public static void main(String[] args) {
        
        int numeroElectrodomesticos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos electrodomésticos desea agregar?"));

        //Creamos un array
        Electrodomestico[] electrodomesticos = new Electrodomestico[numeroElectrodomesticos];

        //Recorrer la cantidad de electros que quiere ingresar
        for ( int i = 0; i < numeroElectrodomesticos; i++){
            //Pedimos al user que elija el tipo de electrodomesticos
            String tipo = JOptionPane.showInputDialog("¿Que tipo de electrodomestico es? (refrigerar, lavadora o microondas)");

            if( tipo.equalsIgnoreCase("refrigerador")){
                // Pedimos los detalles del refri
                String marca = JOptionPane.showInputDialog("Ingresa la marca del refri: ");

                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del refrigerador: "));

                double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad en litros: "));

                electrodomesticos[i] = new Refrigerador(marca, precio, capacidad);

            } else if( tipo.equalsIgnoreCase("lavadora")){
                String marca = JOptionPane.showInputDialog("Ingresa la marca de la lavadora: ");

                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la lavadora: "));

                double carga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad en kg: "));
                electrodomesticos[i] = new Lavadora(marca, precio, carga);
            }else if( tipo.equalsIgnoreCase("microondas") ){
                String marca = JOptionPane.showInputDialog("Ingresa la marca de la microondas: ");

                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del microondas: "));

                double potencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la potencia en vatios: "));
                electrodomesticos[i] = new Microondas(marca, precio, potencia);
            }
        }

        //Recorremos el array de electros para mostrar los detalles y el consumo
        for ( Electrodomestico electrodomestico : electrodomesticos){
            electrodomestico.mostrarDetalles();
            System.out.println("Consumo eléctrico estimado: " + electrodomestico.calcularConsumo() + " KWh");
            System.out.println(); //Espacio en blanco para separar los detalles
        }

    }

}

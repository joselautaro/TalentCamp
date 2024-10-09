package Modulo5.VehiculosEnAlquiler;

import javax.swing.*;

public class SistemaAlquiler {
    
    public static void main(String[] args) {

       try{
        String tipo = JOptionPane.showInputDialog("¿Que tipo de vehiculo desea alquilar? (auto/camion/moto)");
        System.out.println("El tipo de vehiculo seleccionado es: " + tipo);

        VehiculoAlquilable vehiculo;
        if(tipo.equalsIgnoreCase("auto")){
            String marca = JOptionPane.showInputDialog("Ingrese la marca del auto: ");
            System.out.println("La marca del auto es: " + marca);
            vehiculo = new Auto(marca);
        }else if(tipo.equalsIgnoreCase("camion")){
            String marca = JOptionPane.showInputDialog("Ingrese la marca del camión: ");
            System.out.println("La marca del camión es: " + marca);
            vehiculo = new Camion(marca);
        }else if(tipo.equalsIgnoreCase("moto")){
            String marca = JOptionPane.showInputDialog("Ingrese la marca de la moto: ");
            System.out.println("La marca de la moto es: " + marca);
            vehiculo = new Motocicleta(marca);
        }else{
            throw new Exception("Tipo de vehiculo no valido.");
        }
      
        //Pedimos la edad del cliente
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: "));

        System.out.println("Edad del cliente: " + edad);

        //Intentamos alquilar el vehiculo
        try{
            vehiculo.alquilar(edad);
            System.out.println("Vehiculo alquilado con exito");
        }catch(EdadInsuficienteException | ClienteNoValidoException e){
            //Capturamos excepciones especificas relacionadas con el alquiler
            String errorAlquiler = "Error al alquilar vehiculo: " + e.getMessage();
            JOptionPane.showMessageDialog(null, errorAlquiler);
            System.out.println(errorAlquiler);
        }finally{
            System.out.println("El proceso de alquiler ha finalizado");
        }

        //Pedimos que devuelva el vehiculo
        int devolver = JOptionPane.showConfirmDialog(null, "¿Desea devolver el vehiculo?");

        if( devolver == JOptionPane.YES_OPTION ){
            vehiculo.devolver();
            System.out.println("El vehiculo ha sido devuelto");
        }else{
            System.out.println("El vehiculo no ha sido devuelto");
        }

       }catch(Exception e){
        String errorGeneral = "Se ha producido un error: " + e.getMessage();
        JOptionPane.showMessageDialog(null, errorGeneral);
        System.out.println(errorGeneral);
       }

    }
}

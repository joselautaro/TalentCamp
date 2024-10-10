package Modulo5.Transacciones;

import javax.swing.*;

public class SistemaTransferencia {

    public static void main(String[] args) {
        

        try{
            String tipo = JOptionPane.showInputDialog("¿Que tipo de transferencia desear hacer? (nacional/internacional)");

            Transaccion transaccion;

            if( tipo.equalsIgnoreCase("nacional") ){


                String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular");

                double saldoDisponible = Double.parseDouble( JOptionPane.showInputDialog("Ingresa el saldo disponible"));

                double limite = Double.parseDouble( JOptionPane.showInputDialog("Ingresa el limite de transferencia"));

                transaccion = new TransferenciaNacional(titular, saldoDisponible, limite);
            }else if(tipo.equalsIgnoreCase("internacional")){
                
                String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular");

                double saldoDisponible = Double.parseDouble( JOptionPane.showInputDialog("Ingresa el saldo disponible"));

                double limite = Double.parseDouble( JOptionPane.showInputDialog("Ingresa el limite de transferencia"));

                transaccion = new TransferenciaInternacional(titular, saldoDisponible, limite);
            }else{
                throw new Exception("Tipo de transferencia no valido");
            }

            //Pedimos el monto de la transferencia 
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto a transferir"));

            //Intentamos realizar la operacion
            try{

                transaccion.realizarTransaccion(monto);
                transaccion.mostrarDetalles();
            }catch(FondosInsuficientesException | LimiteTransferenciaException e){
                //Capturamos excepciones especificas realinadas con la transacción 
                System.out.println("Error al realizar la transaccion: " + e.getMessage());
            }finally{
                System.out.println("La transaccion ha finalizado sea exitosa o no.");
            }

        }catch(Exception e){
            System.out.println("Se ha producido un error: " + e.getMessage());
        }

    }
    
}

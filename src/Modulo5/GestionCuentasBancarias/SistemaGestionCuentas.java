package Modulo5.GestionCuentasBancarias;

import java.util.*;
import javax.swing.*;

public class SistemaGestionCuentas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            //Pedimos el usuario el tipo de cuenta
            String tipoCuenta = JOptionPane.showInputDialog("¿Que tipo de cuenta deseas abrir? (ahorro/corriente)");
            System.out.println("El tipo de cuenta ingresado es: " + tipoCuenta);

            Cuenta cuenta;

            if( tipoCuenta.equalsIgnoreCase("ahorro") ){
                //Datos de la cuenta de ahorro
                String titular = JOptionPane.showInputDialog("Ingresa el nombre del titular de la cuenta");
                System.out.println("Titular de la cuenta de ahorro: " + titular);
                double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el saldo inicial de la cuenta de ahorro: "));
                System.out.println("Saldo inicial: " + saldoInicial);
                double tasaInteres = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tasa de interes (%):"));
                System.out.println("Tasa de interes: " + tasaInteres + "%");

                //Creamos el objeto de la cuenta de ahorro
                cuenta = new CuentaAhorro(titular, saldoInicial, tasaInteres);
            }else if(tipoCuenta.equalsIgnoreCase("corriente")){
                //Datos de la cuenta de ahorro
                String titular = JOptionPane.showInputDialog("Ingresa el nombre del titular de la cuenta");
                System.out.println("Titular de la cuenta corriente: " + titular);
                double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el saldo inicial de la cuenta corriente: "));
                System.out.println("Saldo inicial: " + saldoInicial);
                double sobregiroMaximo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el limitre de sobregiro:"));
                System.out.println("Limite de sobregiro: " + sobregiroMaximo);
                // Creamos el objeto de CuentaCorriente
                cuenta = new CuentaCorriente(titular, saldoInicial, sobregiroMaximo);
            }else{
                throw new Exception("Tipo de cuenta no valido");
            }

            //Operaciones de deposito
            double montoDeposito = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto deseas depositar?"));
            cuenta.depositar(montoDeposito);
            String mensajeDeposito = "Deposito realizado. Saldo actual: " + cuenta.consultarSaldo();
            JOptionPane.showMessageDialog(null, mensajeDeposito);
            System.out.println(mensajeDeposito);

            //Operaciones de retiro
            double montoRetiro = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto deseas retirar?"));
            try{
                cuenta.retirar(montoRetiro);
                String mensajeRetiro = "Retiro realizado. Saldo actual: " + cuenta.consultarSaldo();
                JOptionPane.showMessageDialog(null, mensajeRetiro);
                System.out.println(mensajeRetiro);
            }catch(FondosInsuficientesException e){
                String errorRetiro = "Error: " + e.getMessage();
                JOptionPane.showMessageDialog(null, errorRetiro);
                System.out.println(errorRetiro);
            }
            //Si es una cuenta de ahorro, calculamos los intereses
            if(cuenta instanceof CuentaAhorro){
                double intereses = cuenta.calcularIntereses();
                String mensajeIntereses = "Intereses generados: $" + intereses;
                JOptionPane.showMessageDialog(null, mensajeIntereses);
                System.out.println(mensajeIntereses);
            }
        }catch(Exception e){
            //Capturamos excepciones generales
            String errorGeneral = "Se ha producido un error: " + e.getMessage();
            JOptionPane.showMessageDialog(null, errorGeneral);
            System.out.println(errorGeneral);
        }finally{
            scanner.close();
        }
    }
    
}

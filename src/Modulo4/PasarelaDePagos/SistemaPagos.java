package Modulo4.PasarelaDePagos;

import javax.swing.*;

public class SistemaPagos {
    public static void main(String[] args) {
        // Pedimos el user cuantos pagos quiere realizar
        int numeroPagos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos pagos deseas realizar?"));

        Pago[] pagos = new Pago[numeroPagos];

        // Recorrer la cantidad de pagos que el usuario quiere procesar
        for (int i = 0; i < numeroPagos; i++) {
            // Pedimos al user que elija el método
            String metodo = JOptionPane.showInputDialog("¿Que metodo de pago deseas usar? (credito/debito/paypal)");

            if (metodo.equalsIgnoreCase("credito")) {
                String nombreTitular = JOptionPane.showInputDialog("Ingrese el nombre del titular de la tarjeta de crédito: ");
                String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el numero de la tarjeta de crédito: ");

                pagos[i] = new PagoTarjetaCredito(nombreTitular, numeroTarjeta);
            } else if (metodo.equalsIgnoreCase("debito")) {
                String nombreTitular = JOptionPane.showInputDialog("Ingrese el nombre del titular de la tarjeta de debito: ");
                String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el numero de la tarjeta de debito: ");

                pagos[i] = new PagoTarjetaDebito(nombreTitular, numeroTarjeta);
            } else if (metodo.equalsIgnoreCase("paypal")) {
                String emailUsuario = JOptionPane.showInputDialog("Ingrese el mail del usuario de paypal: ");

                pagos[i] = new PagoPaypal(emailUsuario);
            }
            // Pedimos el monto del pago
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto: "));
            pagos[i].procesarPago(monto);
            pagos[i].mostrarDetalles();
            System.out.println(); // Separar los detalles
        }
    }
}
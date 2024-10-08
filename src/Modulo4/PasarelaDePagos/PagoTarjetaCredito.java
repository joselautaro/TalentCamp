package Modulo4.PasarelaDePagos;

public class PagoTarjetaCredito implements Pago{

    private String nombreTitular;

    private String numeroTarjeta;

    //Constructor
    public PagoTarjetaCredito(String nombreTitular, String numeroTarjeta){
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
    }

    //Implements del metodo procesar pago
    @Override
    public void procesarPago(double monto){
            System.out.println("Procesando con tarjeta de credito...");
            System.out.println("Titular: " + nombreTitular);
            System.out.println("Monto: $" + monto);
    }

    //Implementacion del método mostrarDetalles
    public void mostrarDetalles(){
        System.out.println("Pago con tarjeta de crédito");
        System.out.println("Numero de tarjeta: **** **** ****" + numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }


}

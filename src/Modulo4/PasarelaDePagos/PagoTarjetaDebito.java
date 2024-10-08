package Modulo4.PasarelaDePagos;

public class PagoTarjetaDebito implements Pago{
    private String nombreTitular;
    private String numeroTarjeta;

    public PagoTarjetaDebito(String nombreTitular, String numeroTarjeta){
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto){
        System.out.println("Procesando Pago con tarjeta de débito...");
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Monto: $" + monto);
    }

    //Implementacion metodo mostrarDetalles
    public void mostrarDetalles(){
        System.out.println("Pago con tarjeta de débito");
        System.out.println("Numero de tarjeta: **** **** ****" + numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
}

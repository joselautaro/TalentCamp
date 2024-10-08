package Modulo4.PasarelaDePagos;

public class PagoPaypal implements Pago{
    private String emailUsuario;

    //Constructor
    public PagoPaypal(String emailUsuario){
        this.emailUsuario = emailUsuario;
    }

    //Implementacion del metodo procesar pago
    @Override
    public void procesarPago(double monto){
        System.out.println("Procesando Pago con PayPal...");
        System.out.println("Usuario: " + emailUsuario);
        System.out.println("Monto: $" + monto);
    }



    //Implementacion del método Mostrar detalles
    @Override
    public void mostrarDetalles(){
        System.out.println("Pago con PayPal: ");
        System.out.println("Email: " + emailUsuario);
    }
}

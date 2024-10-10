package Modulo6.Concesionaria;

import java.util.Date;

public class Transaccion {
    
    private Cliente cliente;
    private Vendedor vendedor;
    private Auto auto;
    private Date fecha;

    public Transaccion(Cliente cliente, Vendedor vendedor, Auto auto){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.auto = auto;
        this.fecha = new Date(); 
    }

    public void mostrarDetalles(){
        System.out.println("Transaccion realizada: ");
        cliente.mostrarDetalles();
        vendedor.mostrarDetalles();
        auto.mostrarDetalles();
        System.out.println("Fecha de la transacción: " + fecha);
    }

}

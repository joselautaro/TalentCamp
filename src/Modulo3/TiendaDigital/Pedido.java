package Modulo3.TiendaDigital;

public class Pedido {
    
    private Cliente cliente; //Cliente que realiza el pedido

    private Carrito carrito; // Carrito de compras del cliente

    private String metodoPago; //Metodo de pago seleccionado

    //Constructor para inicializar un pedido con un cliente, carrito, y metodo
    public Pedido(Cliente cliente, Carrito carrito, String metodoPago){
        this.cliente = cliente;
        this.carrito = carrito;
        this.metodoPago = metodoPago;
    }

    // Metodo para procesar el pedido mostrando el total y detalles al cliente
    public void procesarPedido(){
        System.out.println("Procesando pedido para " + cliente.getNombre() + " en " + cliente.getDireccion());
        System.out.println("Método de pago: " + metodoPago);
        // Mostramos los productos en el carrito
        carrito.mostrarProductos();
        // Mostramos el total a pagar
        System.out.println("Total a pagar: $" + carrito.calcularTotal());
    }

}

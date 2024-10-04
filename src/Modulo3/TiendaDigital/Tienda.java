package Modulo3.TiendaDigital;

import javax.swing.*;

public class Tienda {
    
    public static void main(String[] args) {
         
        // Pedimos los datos del cliente
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");

        String direccionCliente = JOptionPane.showInputDialog("Ingrese la direccion del cliente: ");

        String telefonoCliente = JOptionPane.showInputDialog("Ingrese el telefono del cliente: ");

        // Creamos un objeto cliente con los datos ingresados
        Cliente cliente = new Cliente(nombreCliente, direccionCliente, telefonoCliente);

        // Creamos un carrito para el cliente
        Carrito carrito = new Carrito();

        // Preguntamos cuando productos quiere agregar el cliente
        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos deseas agregar al carrito?"));

        // Bucle para agregar productos al carrito
        for( int i = 0; i <cantidadProductos; i++ ){
            // Pedimos los datos del producto mediante JOption
            String nombreProducto = JOptionPane.showInputDialog("Ingresa el nombre del producto?" + ( i + 1) + ":");
            double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio el precio del producto " + (i + 1) + ":"));

            int cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad disponible del producto " + (i + 1) + ":"));

            // Creamos un objeto producto con los datos ingresados
            Producto producto = new Producto(nombreProducto, precioProducto, cantidadDisponible);

            // Agregamos el producto al carrito
            carrito.agregarProducto(producto);
        }

        // Pedimos el metodo de pago
        String metodoPago = JOptionPane.showInputDialog("Ingrese el metodo de pago: ");

        // Creamos el pedido
        Pedido pedido = new Pedido(cliente, carrito, metodoPago);

        // Procesamos el pedido
        pedido.procesarPedido();

    }

}

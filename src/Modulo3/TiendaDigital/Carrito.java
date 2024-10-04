package Modulo3.TiendaDigital;

import java.util.ArrayList; //Importamos arraylist para manejar una lista de productos

public class Carrito {

    // Atributo privado que almacena los productos añadidos del carrito
    private ArrayList<Producto> productosEnCarrito;

    // Constructor que inicializa el carrito como una lista vacia
    public Carrito(){
        productosEnCarrito = new ArrayList<>(); //Creamos un array vacio para almacenar los productos
    }

    // Metodo para aggregar un producto al carrito
    public void agregarProducto(Producto producto){
        productosEnCarrito.add(producto); //Añadimos cada uno de los productos al array list
    }

    // Metodo para calcular el total del carrito sumando el precio de todos los productos
    public double calcularTotal(){
        double total = 0; //Inicializamos el total en 0
        for( Producto producto : productosEnCarrito ){
            total += producto.getPrecio(); //Sumamos el precio de cada producto al total
        }
        return total;
    }

    // Metodo para mostrar los productos en el carrito
    public void mostrarProductos(){
        for( Producto producto : productosEnCarrito ){
            System.out.println("Producto: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
        }
    }
    
}

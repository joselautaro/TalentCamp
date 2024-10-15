package Modulo7.EmpreTalent;

import java.util.*;
import java.util.function.*;

import javax.swing.JOptionPane;

public class SistemaTienda {

    private List<Producto> inventario;

    public SistemaTienda() {
        inventario = new ArrayList<>();
    }

    // Metodo para agregar un producto
    @OperacionSegura(descripcion = "Agregar un producto al inventario")
    public void agregarProducto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");

        String[] categorias = { "ELECTRONICA", "ROPA", "LIBROS" };

        String categoriaSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Seleccione la categoria del producto: ",
                "Categorias", JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);
        System.out.println("Producto a agregar: " + nombre + ",\n Categoria: " + categoriaSeleccionada);

        CategoriaProducto categoria = CategoriaProducto.valueOf(categoriaSeleccionada);

        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible: "));

        Producto nuevoProducto;

        switch (categoria) {
            case ELECTRONICA:
                int garantia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los meses de garantia: "));
                nuevoProducto = new Electronica(nombre, precio, cantidad, garantia);
                System.out.println("Producto electrónico: " + nombre + "\n Garantía: " + garantia + " meses");
                break;
            case ROPA:
                String talla = JOptionPane.showInputDialog("Ingrese la talla de la ropa: ");
                nuevoProducto = new Ropa(nombre, precio, cantidad, talla);
                System.out.println("Vestimenta: " + nombre + "\n, Talla: " + talla);
                break;
            case LIBROS:
                String autor = JOptionPane.showInputDialog("Ingrese el autor del libro: ");
                nuevoProducto = new Ropa(nombre, precio, cantidad, autor);
                System.out.println("Producto: " + nombre + "\n, Autor: " + autor);
                break;
            default:
                throw new IllegalStateException("Categoria no valida: " + categoria);
        }
        // Agregar el producto al inventario
        inventario.add(nuevoProducto);
        System.out.println("Producto agregado exitosamente: " + nuevoProducto);
    }

    // metodo para mostrar el inventario
    @OperacionSegura(descripcion = "Mostrar inventario")
    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay productos en el inventario.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Producto p : inventario) {
                sb.append(p).append("\n");
                System.out.println("Producto en inventario: " + p);
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    // metodo para aplicar descuento a todos los productos
    @OperacionSegura(descripcion = "Aplicar descuento a todos")
    public void aplicarDescuentoATodos() {
        double porcentaje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de descuento"));
        inventario.forEach(p -> {
            p.aplicarDescuento(porcentaje);
            System.out.println("Descuento aplicado al producto: " + p + "\n con un " + porcentaje + "% de descuento");
        });
        System.out.println("Descuento aplicado a todos los productos");
    }

    public static void main(String[] args) {
        SistemaTienda sistema = new SistemaTienda();

        Map<Integer, Consumer<Void>> menuOpciones = new HashMap<>();
        menuOpciones.put(1, (v) -> sistema.agregarProducto());
        menuOpciones.put(2, (v) -> sistema.mostrarInventario());
        menuOpciones.put(3, (v) -> sistema.aplicarDescuentoATodos());

        boolean salir = false;

        while (!salir) {
            String opcion = JOptionPane.showInputDialog("Menu de gestión de tienda online:\n" +
                    "1. Agregar producto\n" +
                    "2. Mostrar inventario\n" +
                    "3. Aplicar descuento a todos\n" +
                    "4. Salir\n" +
                    "Seleccione una opción:");
            try{
                int opcionInt = Integer.parseInt(opcion);
                Consumer<Void> operacion = menuOpciones.get(opcionInt);
                if(operacion != null){
                    operacion.accept(null);
                }else if(opcionInt == 4){
                    salir = true;
                    System.out.println("Saliendo del sistema tienda...");
                }else{
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, ingrese un número valido!");
            }
        }
    }

}

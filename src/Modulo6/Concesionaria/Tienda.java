package Modulo6.Concesionaria;

import javax.swing.*;
import java.util.*;

public class Tienda {
    
    private List<Auto> autos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    private List<Transaccion> transacciones = new ArrayList<>();

    //Método para agregar autos
    void agregarAutos(){
        try{

            String marca = JOptionPane.showInputDialog("Ingresar la marca del auto: ");
            System.out.println("Marca del auto: " + marca);

            String modelo = JOptionPane.showInputDialog("Ingresar el modelo del auto: ");
            System.out.println("Modelo del auto: " + modelo);

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el precio del auto: "));
            System.out.println("Precio del auto: " + precio);

            autos.add(new Auto(marca, modelo, precio));
            System.out.println("Auto agregado satisfactoriamente");
        }catch(NumberFormatException e){
            System.out.println("Error: ingreso de datos incorrecto");
        }
    }
    void agregarClientes(){
        try{

            String nombre = JOptionPane.showInputDialog("Ingresar el nombre del cliente: ");
            System.out.println("Nombre del cliente: " + nombre);

            String direccion = JOptionPane.showInputDialog("Ingrese la direccion del cliente: ");
            System.out.println("Dirección del cliente: " + direccion);

            String telefono = JOptionPane.showInputDialog("Ingresar el telefono del cliente: ");
            System.out.println("El telefono del cliente es: ");

            clientes.add(new Cliente(nombre, direccion, telefono));
            System.out.println("Auto agregado satisfactoriamente");
        }catch(NumberFormatException e){
            System.out.println("Error: ingreso de datos incorrecto");
        }
    }
    void agregarVendedor(){
        try{

            String nombre = JOptionPane.showInputDialog("Ingresar el nombre del vendedor: ");
            System.out.println("Nombre del cliente: " + nombre);

            String direccion = JOptionPane.showInputDialog("Ingrese la direccion del vendedor: ");
            System.out.println("Dirección del cliente: " + direccion);

            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el telefono del cliente: "));
            System.out.println("El salario del vendedor es: " + salario);

            vendedores.add(new Vendedor(nombre, direccion, salario));
            System.out.println("Vendedor agregado con éxito");
        }catch(NumberFormatException e){
            System.out.println("Error: ingreso de datos incorrecto");
        }
    }

    void realizarVenta(){
        //Verificamos si hay autos, clientes y vendedores disponibles
        if( autos.isEmpty() || clientes.isEmpty() || vendedores.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: faltan datos (autos, clientes o vendedores)");
            return;
        }
        //Solicitamos el nombre del cliente para la venta
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente para la venta: ");
        Cliente cliente = buscarCliente(nombreCliente); //Buscamos el cliente en la lista de clientes
    
        if( clientes == null){
            System.out.println("Error: cliente no encontrado");
            return;
        }
        System.out.println("Cliente para la venta: " + cliente.getNombre());

        String nombreVendedor = JOptionPane.showInputDialog("Ingresar el nombre del vendedor: ");

        Vendedor vendedor = buscarVendedor(nombreVendedor);
        if( vendedor == null){
            System.out.println("Vendedor no encontrado");
            return;
        }

        //Solicitamos el modelo del auto para la venta
        // String modeloAuto = JOptionPane.showInputDialog("Ingresar el modelo del auto para la venta: ");
        // Auto auto = buscarAuto(modeloAuto); //Buscar el auto en la lista del auto
        // System.out.println("Auto para la venta: " + auto.getModelo());
        // if( auto == null){
        //     JOptionPane.showMessageDialog(null, "Error auto no encontrado");
        //     return;
        // }
        // Solicitamos el modelo del auto para la venta
        String modeloAuto = JOptionPane.showInputDialog("Ingrese el modelo del auto para la venta: ");
        Auto auto = buscarAuto(modeloAuto); // Buscamos el auto en la lista de autos
        if (auto == null) {
            JOptionPane.showMessageDialog(null, "Error: Auto no encontrado.");
            return;
        }

        transacciones.add(new Transaccion(cliente, vendedor, auto));
        System.out.println("Venta realiza con exito");
    }

    private Cliente buscarCliente(String nombre){
        for( Cliente cliente : clientes){
            if( cliente.getNombre().equalsIgnoreCase(nombre) ){
                return cliente;
            }
        }
        return null;
    }

    private Vendedor buscarVendedor(String nombre){
        for(Vendedor vendedor : vendedores){
            if( vendedor.getNombre().equalsIgnoreCase(nombre) ){
                return vendedor;
            }
        }
        return null;
    }

    private Auto buscarAuto(String modelo){
        for(Auto auto : autos){
            if( auto.getModelo().equalsIgnoreCase(modelo)){
                return auto;
            }
        }
        return null;
    }

    public void mostrarTransacciones(){
        //Verificamos si hay transacciones realizadas
        if(transacciones.isEmpty()){
            System.out.println("No se han realizado transacciones");
            return;
        }

        StringBuilder detalles = new StringBuilder();

        for(Transaccion transaccion : transacciones){
            transaccion.mostrarDetalles();
        }
        JOptionPane.showMessageDialog(null, detalles.toString());

    }
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        boolean salir = false;

        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                                "Menu:\n"+
                                "1. Agregar auto\n"+
                                "2. Agregar Cliente\n"+
                                "3. Agregar Vendedor\n"+
                                "4. Realizar Venta\n"+
                                "5. Mostrar transacciones\n"+
                                "6. Salir\n"+
                                "Ingrese una opción:"
            );
            switch (opcion) {
                case "1":
                    tienda.agregarAutos();
                    break;
                case "2":
                    tienda.agregarClientes();
                    break;
                case "3":
                    tienda.agregarVendedor();
                    break;
                case "4":
                    tienda.realizarVenta();
                    break;
                case "5":
                    tienda.mostrarTransacciones();
                case "6":
                    salir = true;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida");
            }
        }
    }



}

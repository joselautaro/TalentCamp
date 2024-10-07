package Modulo4.InventarioDeElectrodomesticos;

public class Electrodomestico {

    protected String marca; //Marca del electrodomestico

    protected double precio;

    //Constructor
    public Electrodomestico( String marca, double precio ){
        this.marca = marca;
        this.precio = precio;
    }

    //Metodo que puede ser sobreescrito por las subclases
    public void mostrarDetalles(){
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
    }

    //Metodo que será sobreescrito en las subclases para calcular el consumo electricto estimado
    public double calcularConsumo(){
        return 0; //Valor por defecto
    }
    
}

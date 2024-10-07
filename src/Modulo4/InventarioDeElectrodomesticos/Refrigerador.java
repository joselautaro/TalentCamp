package Modulo4.InventarioDeElectrodomesticos;

public class Refrigerador extends Electrodomestico{
    private double capacidad;

    //Constructor
    public Refrigerador( String marca, double precio, double capacidad){
        super(marca, precio);
        this.capacidad = capacidad;
    }

    //Sobreescribir metodo mostrarDetalles
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Capacidad: " + capacidad + " litros");
    }

    @Override
    public double calcularConsumo(){
        return capacidad * 0.5; 
    }
}

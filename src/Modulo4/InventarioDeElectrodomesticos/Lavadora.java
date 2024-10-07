package Modulo4.InventarioDeElectrodomesticos;

public class Lavadora extends Electrodomestico{
    
    private double carga; //Capacidad de carga en kilogramos

    //Constructor
    public Lavadora( String marca, double precio, double carga ){
        super(marca, precio);
        this.carga = carga;
    }

    //Sobreescribimos el metodo para mostrar detalles adicionales
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Carga: " + carga + "kg");
    }

    //Sobreescribimos el metodo para el calcular el consumo electrico estimado
    @Override
    public double calcularConsumo(){
        return carga * 0.8; //Ejemplo de calculo basado en la carga
    }
    
}

package Modulo4.InventarioDeElectrodomesticos;

public class Microondas extends Electrodomestico {

    private double potencia; //Potencia en vatios del microondas

    //Constructor
    public Microondas( String marca, double precio, double potencia ){
        super(marca, precio); //llamamos al constructor de la clase base
        this.potencia = potencia;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Potencia: " + potencia + " vatios");
    }

    //Sobreescribios el metodo para calcular el consumo estimado
    @Override
    public double calcularConsumo(){
        return potencia * 0.1; //Ejemplo basado en la potencia;
    }

    
}

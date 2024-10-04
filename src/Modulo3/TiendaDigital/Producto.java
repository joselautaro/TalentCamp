package Modulo3.TiendaDigital;

public class Producto{

    //Atributo priovado
    private String nombre;

    private double precio;

    private int cantidadDisponible; //Cantidad de stock del producto

    // Constructor de la clase producto para inicializaar los atributos
    public Producto ( String nombre, double precio, int cantidadDisponible ){
        this.nombre = nombre; //Asignamos el nombre al atributo de clase
        this.precio = precio; //Asignamos el precio al atributo de la clase 
        this.cantidadDisponible = cantidadDisponible;//Asignamos la cantidad disponible al atributo de la clase 
    }

    // Getter para obtener el nombre del producto
    public String getNombre(){
        return nombre;
    }
    // Getter para obtener el precio del producto
    public double getPrecio(){
        return precio;
    }
    // Getter para obtener la cantidad disponible del producto
    public int getCantidadDisponible(){
        return cantidadDisponible;
    }
    //Setter para actualizar la cantidad disponible del producto
    public void setCantidadDisponible(int cantidadDisponible){
        this.cantidadDisponible = cantidadDisponible; //Actualizamos la cantidad de stock
    }

}

package Modulo6.Concesionaria;

public class Auto {
    
    private String marca;
    private String modelo;
    private double precio;

    public Auto(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    public double getPrecio(){
        return precio;
    }

    //Metodo para mostrar detalles
    public void mostrarDetalles(){
        System.out.println("Auto: " + marca + " " + modelo + " - Precio: $" + precio);
    }
}

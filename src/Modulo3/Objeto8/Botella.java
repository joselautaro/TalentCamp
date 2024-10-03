package Modulo3.Objeto8;

public class Botella {
    double capacidad;

    double cantidadActual;

    public double calcularAguaFaltante(){
        return capacidad - cantidadActual;
    }
}

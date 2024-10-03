package Modulo3.Objeto5;

public class Tiempo {

    int segundosTotales;

    // Metodos para calcular horas
    public int calcularHoras(){
        return segundosTotales / 3600;
    }

    public int calcularMinutos(){
        return (segundosTotales % 3600) / 60;
    }

    public int calcularSegundos(){
        return segundosTotales % 60;
    }
    
}

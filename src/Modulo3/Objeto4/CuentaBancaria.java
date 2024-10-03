package Modulo3.Objeto4;

public class CuentaBancaria {
    double capital;

    double tasaInteres;

    int anios;

    // Método para calcular el interes simple
    public double calcularInteres(){
        // La formula es: I = p * r * t;
        return capital * tasaInteres * anios;
    }
}

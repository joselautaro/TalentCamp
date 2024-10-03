package Modulo3.Objeto7;

public class Silla {

    String material;

    boolean plegable;

    // Metodo para mostra la info de la silla
    public String infoSilla(){
        return "Silla de " + material + (plegable ? "es plegable." : " No es plegable.");
    }
}

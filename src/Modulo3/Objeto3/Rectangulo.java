package Modulo3.Objeto3;

public class Rectangulo {

    // Atributos
    int base;

    int altura;
    
    public int calcularArea(){
        return base * altura;
    }

    // Método para calcular perimetro
    public int calcularPerimetro(){
        return 2 * (base + altura);
    }
}

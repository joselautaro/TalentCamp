package Modulo3.Objeto2;

import javax.swing.JOptionPane;

public class Operacion {
    

    // Atributos == caracteristicas

    int numero1;

    int numero2;

    int suma;

    int resta;

    int multiplicacion;

    int division;

    // Método para pedirle al usuario que digite dos numeros
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
    }
    // Métodos / Acciones
    public void sumar(){
        suma = numero1 + numero2;
    }
    public void resta(){
        resta = numero1 - numero2;
    }
    public void multiplicacion(){
        multiplicacion = numero1 * numero2;
    }
    public void division(){
        division = numero1 / numero2;
    }

    public void mostrarResultado(){
        System.out.println("El resultado es: " + suma);
        System.out.println("El resultado es: " + resta);
        System.out.println("El resultado es: " + multiplicacion);
        System.out.println("El resultado es: " + division);
    }


}

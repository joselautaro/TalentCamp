package Modulo2P1;

//Clasificacion por calificacion

import javax.swing.JOptionPane;

public class Ejemplo3 {
    public static void main(String[] args) {
        String calificacion = JOptionPane.showInputDialog("Ingrese una nota: ");

        int nota = Integer.parseInt(calificacion);

        if( nota >= 90){
            System.out.println("Excelente");
        }else if(nota >= 80){
            System.out.println("Bueno");
        }else if(nota >= 70){
            System.out.println("Regular");
        }else{
            System.out.println("Insuficiente, ESTÁS REPROBADO!");
        }
    }
}

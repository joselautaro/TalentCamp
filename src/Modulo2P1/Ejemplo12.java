package Modulo2P1;

//Sistema de puntuación de un juego

import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar la cantidad de enemigos derrotados: ");
        int enemigos = sc.nextInt();

        System.out.print("Ingrese la cantidad de monedas recolectadas: ");
        int monedas = sc.nextInt();

        System.out.print("Ingrese la cantidad de objetos especiales obtenidos: ");
        int objetosEspeciales = sc.nextInt();

        //Calcular la puntuacion total
        int puntuacionTotal = (enemigos * 50) + (monedas * 10) + (objetosEspeciales *100);
        System.out.print("Puntuación total: " + puntuacionTotal);

        if( puntuacionTotal >= 1000 ){
            System.out.println("Ganaste el juego");
        }else if (puntuacionTotal >= 500){
            System.out.println("Buen trabajo casi lo logras");
        }else{
            System.out.println("Sigue participando");
        }
    }
}

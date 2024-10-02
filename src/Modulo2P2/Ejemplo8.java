package Modulo2P2;
//Operaciones con localtime

import java.time.LocalTime;
public class Ejemplo8 {
    public static void main(String[] args) {

        //Hora actual
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        //Crear una específica
        LocalTime horaAlmuerzo = LocalTime.of(13, 30);
        System.out.println("Hora almuerzo: " + horaAlmuerzo);

        //Calcular una hora futura sumando minutos
        LocalTime horaFutura = horaActual.plusMinutes(10);
       System.out.println("Hora futura dentro de 10 minutos: " + horaFutura);
    }
}

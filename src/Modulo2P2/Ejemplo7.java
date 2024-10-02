package Modulo2P2;

//Operaciones con LocalDato para poder manejar fechas
import java.time.LocalDate;
public class Ejemplo7 {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);

        LocalDate fechaNacimiento = LocalDate.of( 1992, 11, 6 );
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);

        LocalDate fechaFutura = fechaActual.plusDays(10);
        System.out.println("Fecha dentro de 10 dias: " + fechaFutura);
    }
}

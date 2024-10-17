package Modulo7.GestionEventosYParticipantes;

public class Seminario extends Evento{
    private String ponente;

    public Seminario(String nombre, String fecha, String ponente, double costoInscripcion){
        super(nombre, fecha, TipoEvento.SEMINARIO, costoInscripcion);
        this.ponente = ponente;
    }
    @Override
    public void mostrarDetalles(){
        System.out.println("Seminario dirigido por: " + ponente + ". \nCosto de inscripción: " + costoInscripcion);
    }
}

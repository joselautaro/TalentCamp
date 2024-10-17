package Modulo7.GestionEventosYParticipantes;

public class Concierto extends Evento{
    private String artistaPrincipal;

    public Concierto(String nombre, String fecha, String artistaPrincipal, double costoInscripcion){
        super(nombre, fecha, TipoEvento.CONCIERTO, costoInscripcion);
        this.artistaPrincipal = artistaPrincipal;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Concierto de: " + artistaPrincipal + ". \nCosto de inscripción: " + costoInscripcion);
    }
}

package Modulo7.GestionEventosYParticipantes;

public class Conferencia extends Evento{
    private  String tema;

    public Conferencia(String nombre, String fecha, String tema, double costoInscripcion){
        super(nombre, fecha, TipoEvento.CONFERENCIA, costoInscripcion);
        this.tema = tema;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Conferencia sobre: "+ tema + ". \nCosto de inscripción: " + costoInscripcion);
    }
}

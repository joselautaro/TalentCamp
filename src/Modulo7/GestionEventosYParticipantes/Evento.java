package Modulo7.GestionEventosYParticipantes;

import java.util.*;

public abstract class Evento {
    protected String nombre;
    protected String fecha;
    protected List<Participante> participantes;
    protected TipoEvento tipo;
    protected double costoInscripcion;

    public Evento(String nombre, String fecha, TipoEvento tipo, double costoInscripcion){
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        this.costoInscripcion = costoInscripcion;
        this.participantes = new ArrayList<>();
    }
    public abstract void mostrarDetalles();

    public void inscribirParticipante(Participante participante) throws InscripcionNoPermitidaException{
        if(!participante.puedeInscribirse(this)){
            throw new InscripcionNoPermitidaException("El participante no cumple con los requisitos");
        }
        participantes.add(participante);
        participante.asignarEvento(this);
    }

    public List<Participante> getParticipantes(){
        return participantes;
    }



    @Override
    public String toString(){
        return "Evento: " + nombre + ", \nFecha: " + fecha + ", \nTipo: " + tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }
    public TipoEvento getTipo() {
        return tipo;
    }
    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
    public double getCostoInscripcion() {
        return costoInscripcion;
    }
    public void setCostoInscripcion(double costoInscripcion) {
        this.costoInscripcion = costoInscripcion;
    }
}

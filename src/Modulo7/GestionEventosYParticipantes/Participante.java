package Modulo7.GestionEventosYParticipantes;

import java.util.*;

public class Participante implements Inscribible{
    private String nombre;
    private String email;
    private double saldo;
    private List<Evento> eventosInscritos;

    public Participante(String nombre, String email, double saldo){
        this.nombre = nombre;
        this.email = email;
        this.saldo = saldo;
        this.eventosInscritos = new ArrayList<>();
    }

    public boolean puedeInscribirse(Evento evento){
        return saldo >= evento.getCostoInscripcion();
    }

    public void asignarEvento(Evento evento){
        eventosInscritos.add(evento);
        saldo -= evento.getCostoInscripcion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Evento> getEventosInscritos() {
        return eventosInscritos;
    }

    public void setEventosInscritos(List<Evento> eventosInscritos) {
        this.eventosInscritos = eventosInscritos;
    }
    @Override
    public String toString(){
        return nombre + " (" + email + ")";
    }
}

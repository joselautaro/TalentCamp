package Modulo7.GestionEventosYParticipantes;

import javax.swing.*;
import java.util.*;
// import java.util.function.Consumer;

public class GestorEventos {
    private List<Evento> eventos;
    private List<Participante> participantes;    

    public GestorEventos(){
        eventos = new ArrayList<>();
        participantes = new ArrayList<>();
    }

    public void agregarEvento(){
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de evento (CONFERENCIA/CONCIERTO/SEMINARIO)");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del evento: ");
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha del evento: ");
        double costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del evento: "));

        Evento evento = null;

        if(tipo.equalsIgnoreCase("CONFERENCIA")){
            String tema = JOptionPane.showInputDialog("Agregue el tema de la conferencia: ");
            evento = new Conferencia(nombre, fecha, tema, costo);
        }else if(tipo.equalsIgnoreCase("CONCIERTO")){
            String artista = JOptionPane.showInputDialog("Ingrese el nombre del/a artista: ");
            evento = new Concierto(nombre, fecha, artista, costo);
        }else if(tipo.equalsIgnoreCase("SEMINARIO")){
            String ponente = JOptionPane.showInputDialog("Ingrese el nombre del/a ponente: ");
            evento = new Seminario(nombre, fecha, ponente, costo);
        }
        if(evento != null){
            eventos.add(evento);
            System.out.println("Evento agregado correctamente");
        }
    }

    public void inscribirParticipante(){
        String nombreEvento = JOptionPane.showInputDialog("Ingrese el nombre del evento: ");
        Evento evento = buscarEvento(nombreEvento);

        if(evento == null){
            JOptionPane.showMessageDialog(null,"Evento no encontrado");
            return;
        }

        String nombreParticipante = JOptionPane.showInputDialog("Agregue el nombre del participante: ");
        Participante participante = buscarParticipante(nombreParticipante);

        try{
            evento.inscribirParticipante(participante);
            System.out.println("Participante inscripto correctamente");
        }catch(InscripcionNoPermitidaException e){
            System.out.println(e.getMessage());
        }
    }

    public void mostrarEventos(){
        StringBuilder sb = new StringBuilder("Eventos disponibles:\n");
        for(Evento evento : eventos){
            sb.append(evento).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    //metodo para mostrar participantes inscriptos
    public void mostrarParticipantesEvento(){
        String nombreEvento= JOptionPane.showInputDialog("Ingrese el nombre del evento: ");
        Evento evento = buscarEvento(nombreEvento);

        if( evento == null){
            JOptionPane.showMessageDialog(null, "Evento no encontrado");
            return;
        }

        StringBuilder sb = new StringBuilder("Participantes inscriptos en el evento " + nombreEvento + ":\n");
        for(Participante participante : evento.getParticipantes()){
            sb.append(participante).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private Evento buscarEvento(String nombre){
        for(Evento evento : eventos){
            if( evento.nombre.equalsIgnoreCase(nombre) ){
                return evento;
            }
        }
        return null;
    }

    //buscar participante por nombre
    private Participante buscarParticipante(String nombre){
        for( Participante participante : participantes){
            if(participante.getNombre().equalsIgnoreCase(nombre)){
                return participante;
            }
        }
        return null;
    }

    //agregar un participante al sistema
    public void agregarParticipante(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del participante: ");
        String email = JOptionPane.showInputDialog("Ingrese el email del participante: ");

        double saldo = Double.parseDouble( JOptionPane.showInputDialog("Ingrese el saldo disponible del participante: "));

        Participante participante = new Participante(nombre, email, saldo);

        participantes.add(participante);

        System.out.println("Participante agregado correctamente");
    }

    public static void main(String[] args) {
        GestorEventos gestor = new GestorEventos();

        Map<Integer, Runnable> menuOpciones = new HashMap<>();

        menuOpciones.put(1, () -> {
            gestor.agregarEvento();
           
        });
        menuOpciones.put(2, () -> {
            gestor.inscribirParticipante();
        });
        menuOpciones.put(3, () -> {
            gestor.mostrarEventos();
        });
        menuOpciones.put(4, () -> {
            gestor.mostrarParticipantesEvento();
        });
        menuOpciones.put(5, () -> {
            gestor.agregarParticipante();
        });

        int opcion;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú de opciones:\n"+
                    "1. Agregar Evento\n"+
                    "2. Inscribir participante\n" + 
                    "3. Mostrar evento\n"+
                    "4. Mostrar participantes por evento\n"+
                    "5. Agregar participante\n"+
                    "0. Salir"
            ));
            Runnable accion = menuOpciones.get(opcion);
            if(accion != null){
                accion.run();
            }else if(opcion != 0){
                System.out.println("Opcion invalida");
            }
        }while(opcion != 0);
    }
}

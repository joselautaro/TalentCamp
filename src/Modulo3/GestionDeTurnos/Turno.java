package Modulo3.GestionDeTurnos;

public class Turno {

    private Medico medico;

    private Paciente paciente;

    private String fecha;

    public Turno( Medico medico, Paciente paciente, String fecha ){
        this.medico = medico;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    // Método para mostrar los detalles del turno
    public void mostrarDetallesTurno ( ){
        // Imprimimos los detalles del turno
        System.out.println("Turno asignado: ");
        System.out.println("Paciente: " + paciente.getNombre() + ", Teléfono: " + paciente.getTelefono());
        System.out.println("Médico: " + medico.getNombre() + ", Especialidad: " + medico.getEspecialidad());
        System.out.println("Fecha de turno: " + fecha);
    }
    
}

package Modulo3.GestionDeTurnos;

import javax.swing.JOptionPane;

// Es la clase principal donde se ejecuta el sistema

public class SistemaGestionTurnos {

    public static void main(String[] args) {
        // Pedimos al user que ingrese los datos del medico
        String nombreMedico = JOptionPane.showInputDialog("Ingrese el nombre del médico: ");

        String especialidadMedico = JOptionPane.showInputDialog("Ingrese la especialidad: ");

        // Creamos un objeto medico con los datos ingresados
        Medico medico = new Medico(nombreMedico, especialidadMedico);

        // Pedirle al user que ingrese sus datos
        String nombrePaciente = JOptionPane.showInputDialog("Estimado/a paciente, ingrese su nombre: ");

        String telefonoPaciente = JOptionPane.showInputDialog("Estimado/a paciente, ingrese su teléfono: ");

        // Creamos un objeto paciente con los datos ingresados
        Paciente paciente = new Paciente(nombrePaciente, telefonoPaciente);

        String fechaTurno = JOptionPane.showInputDialog("Ingrese la fecha del turno (dd/mm/yyyy): ");

        // Creamos un objeto con el medico, el paciente y la fecha ingresada
        Turno turno = new Turno(medico, paciente, fechaTurno);

        //Mostramos los detalles del turno
        turno.mostrarDetallesTurno();

    }
    
}

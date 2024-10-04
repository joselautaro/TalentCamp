package Modulo3.GestionDeTurnos;

public class Medico {

    // Atributos privados de clase medico

    private String nombre;

    private String especialidad;

    // Constructor de la clase medico
    public Medico( String nombre, String especialidad){
        this.nombre= nombre;
        this.especialidad = especialidad;
    }

    // Getter para obtener el nombre del medido
    public String getNombre(){
        return nombre;
    }

    // Getter para obtener la especialidad
    public String getEspecialidad () {
        return especialidad;
    }
    
}

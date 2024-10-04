package Modulo3.GestionDeTurnos;

public class Paciente {

    // Atributos privados
    private String nombre;

    private String telefono;

    public Paciente( String nombre, String telefono ){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getter para obtener el nombre
    public String getNombre(){
        return nombre;
    }

    // Getter para obtener el telefono 
    public String getTelefono(){
        return telefono;
    }
    
}

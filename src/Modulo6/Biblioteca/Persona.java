package Modulo6.Biblioteca;

public abstract class Persona {
    protected String nombre;
    protected String id;

    public Persona(String nombre, String id){
        this.nombre = nombre;
        this.id =id;
    }

    public abstract void mostrarDetalles();
}

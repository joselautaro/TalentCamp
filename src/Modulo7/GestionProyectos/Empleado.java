package Modulo7.GestionProyectos;

public class Empleado {

    private String nombre;
    private int edad;
    private RolEmpleado rol;

    public Empleado(String nombre, int edad, RolEmpleado rol){
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public RolEmpleado getRol(){
        return rol;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setRol(RolEmpleado rol){
        this.rol = rol;
    }

    @Override
    public String toString(){
        return "Empleado: " + nombre + ", Edad: " + edad + ", Rol: " + rol;
    }


    
}

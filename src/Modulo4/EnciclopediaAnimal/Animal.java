package Modulo4.EnciclopediaAnimal;

public class Animal {

    protected String nombre;

    protected int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo para mostrar la info del animal
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    //Método abstracto que será implementado por las subclases para emitir sonido
    public void emitirSonido(){
        System.out.println("Este animal no emite ningun sonido específico.");
    }
    
}

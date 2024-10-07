package Modulo4.EnciclopediaAnimal;

public class Perro extends Animal{

    public Perro(String nombre, int edad){
        super(nombre, edad);
    }
    //Sobreescribir el metodo emitir sonido para que el perro ladre
    @Override
    public void emitirSonido(){
        System.out.println("El perro ladra: GUAU!");
    }
    
}

package Modulo4.EnciclopediaAnimal;

public class Pajaro extends Animal{
    public Pajaro(String nombre, int edad){
        super(nombre, edad);
    }
    //Sobreescribir el metodo emitir sonido para que el pajaro cante
    @Override
    public void emitirSonido(){
        System.out.println("El pájaro canta: PIO PIO!");
    }
}

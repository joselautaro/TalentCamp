package Modulo4.EnciclopediaAnimal;

public class Gato extends Animal{
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }
    //Sobreescribir el metodo emitir sonido para que el gato maulle
    @Override
    public void emitirSonido(){
        System.out.println("El gato maulla");
    }
}

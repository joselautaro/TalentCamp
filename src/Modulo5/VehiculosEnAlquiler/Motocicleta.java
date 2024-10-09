package Modulo5.VehiculosEnAlquiler;

public class Motocicleta implements VehiculoAlquilable{
    private String marca;
    private boolean alquilado;

    public Motocicleta(String marca){
        this.marca = marca;
        this.alquilado = false;
    }

    //Implementacion del metodo alquilar
    @Override
    public void alquilar(int edad) throws EdadInsuficienteException, ClienteNoValidoException{
        //Verificamos si el cliente tiene la edad minina para alquilar el auto
        if( edad < 18){
            throw new EdadInsuficienteException("El cliente no tiene la edad minima para alquilar una motocicleta");
        }
        if(alquilado){
            throw new ClienteNoValidoException("La motocicleta ya ha sido alquilada");
        }
        //Si esta todo bien, alquilamos el auto
        alquilado = true;
        System.out.println("La motocicleta " + marca + " ha sido alquilada");
    }

    @Override
    public void devolver(){
        alquilado = false;
        System.out.println("La motocicleta " + marca + " ha sido devuelta");
    }
}

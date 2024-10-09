package Modulo5.VehiculosEnAlquiler;

public class Auto implements VehiculoAlquilable{
    private String marca;
    private boolean alquilado;

    public Auto(String marca){
        this.marca = marca;
        this.alquilado = false;
    }

    //Implementacion del metodo alquilar
    @Override
    public void alquilar(int edad) throws EdadInsuficienteException, ClienteNoValidoException{
        //Verificamos si el cliente tiene la edad minina para alquilar el auto
        if( edad < 21){
            throw new EdadInsuficienteException("El cliente no tiene la edad minima para alquilar un auto");
        }
        if(alquilado){
            throw new ClienteNoValidoException("El auto ya ha sido alquilado");
        }
        //Si esta todo bien, alquilamos el auto
        alquilado = true;
        System.out.println("El auto " + marca + " ha sido alquilado");
    }

    @Override
    public void devolver(){
        alquilado = false;
        System.out.println("El auto " + marca + " ha sido devuelto");
    }
}

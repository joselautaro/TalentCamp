package Modulo5.VehiculosEnAlquiler;

public class ClienteNoValidoException extends Exception{
    public ClienteNoValidoException(String mensaje){
        super(mensaje);
    }
}

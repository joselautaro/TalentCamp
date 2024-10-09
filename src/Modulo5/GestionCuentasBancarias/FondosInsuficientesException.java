package Modulo5.GestionCuentasBancarias;

public class FondosInsuficientesException extends Exception{
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}

package Modulo5.Transacciones;

public interface Transaccion {
    void realizarTransaccion(double monto) throws FondosInsuficientesException, LimiteTransferenciaException;
    void mostrarDetalles();
}

package Modulo5.Transacciones;

public class TransferenciaInternacional implements Transaccion{
    private String titular;
    private double saldoDisponible;
    private double limiteTransferencia;

    //Constructor
    public TransferenciaInternacional(String titular, double saldoDisponible, double limiteTransferencia){
        this.titular = titular;
        this.saldoDisponible = saldoDisponible;
        this.limiteTransferencia = limiteTransferencia;
    }

    //Implementamos el metodo realizar transaccion
    @Override
    public void realizarTransaccion(double monto) throws FondosInsuficientesException, LimiteTransferenciaException{
        //Verificar si el monto supera el limite el limite de transferencia
        if( monto > limiteTransferencia){
            throw new LimiteTransferenciaException("El monto supera el limite de transferencia");
        }
        //Verificar si hay suficiente saldo disponible
        if( monto > saldoDisponible){
            throw new FondosInsuficientesException("Fondos insuficientes para realizar la transacción");
        }

        //Si esta bien, realizamos la transferencia
        saldoDisponible -= monto;
        System.out.println("Transferencia internacional realizada por: $" + monto);
    }

    public void mostrarDetalles(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo disponible: $" + saldoDisponible);
        System.out.println("Limite transferencia: $ " + limiteTransferencia);
    }
}

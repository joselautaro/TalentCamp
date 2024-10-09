package Modulo5.GestionCuentasBancarias;

public class CuentaAhorro extends Cuenta{
    //tasa de interes en porcentaje
    private double tasaInteres;

    //constructor
    public CuentaAhorro(String titular, double inicial, double tasaInteres){
        super(titular, inicial);
        this.tasaInteres = tasaInteres;
    }

    //metodo para calcular el interes basado en la tasa de interes
    @Override
    public double calcularIntereses(){
        return saldo * tasaInteres /100;
    }

    //metodo para retirar el dinero sin excepciones para cuentas de ahorro
    @Override
    public void retirar(double monto) throws FondosInsuficientesException{
        if( saldo < monto){
            throw new FondosInsuficientesException("Fondos insuficientes para retirar");
        }
        saldo -= monto;
    }
}

package Modulo5.GestionCuentasBancarias;

public abstract class Cuenta implements CuentaBancaria{
    
    protected String titular;

    protected double saldo;

    //Constructor
    public Cuenta (String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    //metodo para depositar dinero en la cuenta
    @Override
    public void depositar(double monto){
        saldo+= monto;
    }

    //metodo para consultar el saldo actual
    @Override
    public double consultarSaldo(){
        return saldo;
    }

}

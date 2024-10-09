package Modulo5.GestionCuentasBancarias;

public class CuentaCorriente extends Cuenta {

    private double sobregiroMaximo; 

    public CuentaCorriente(String titular, double saldoInicial, double sobregiroMaximo){
        super(titular, saldoInicial);
        this.sobregiroMaximo = sobregiroMaximo;
    }

    //metodo para que en las cuentas corrientes no se calculen interes
    @Override
    public double calcularIntereses(){
        return 0;
    }

    //metodo para retirar dinero con sobregiro permitido
    @Override
    public void retirar(double monto) throws FondosInsuficientesException{
        if( saldo + sobregiroMaximo < monto ){
            throw new FondosInsuficientesException("Fondos insuficientes y limite de sobre giro excedido");
        }
        saldo -= monto; //Reducimos el saldo (sobregiro si es necesario)
    }

}

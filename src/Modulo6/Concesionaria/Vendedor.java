package Modulo6.Concesionaria;

public class Vendedor extends Persona{

    private double salario;

    public Vendedor(String nombre, String direccion, double salario){
        super(nombre, direccion);
        this.salario = salario;
    }

    //Getter del salario
    public double getSalario(){
        return salario;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Vendedor: " + nombre + ", Dirección: " + direccion + ", Salario: " + salario);
    }
}

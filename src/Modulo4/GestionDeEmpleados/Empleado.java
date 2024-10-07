package Modulo4.GestionDeEmpleados;

public class Empleado {

    // Atributos protgidos accesibles desde las subclases
    protected String nombre;

    protected double salario;

    // Constructor de la clase BASE empleados
    public Empleado(String nombre, double salario){
        this.nombre = nombre; //Inicializamos los atributos
        this.salario = salario;
    }

    // Metodo para obtener el nombre el empleado
    public String getNombre(){
        return nombre;
    }

    // Metodo para calcular el salario (será sobreescrito en subclases)
    public double calcularSalario(){
        return salario; //Retorna el salario
    }

    // Método para mostrar los detalles del empleado
    public void mostrarDetalles(){
        System.out.println("Empleado: " + nombre + ", Salario: " + calcularSalario());
    }
    
}

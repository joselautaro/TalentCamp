package Modulo4.GestionDeEmpleados;

public class EmpleadoTiempoCompleto extends Empleado {

    private double bono; //Atributo adicional: bono para a tiempo completo

    //Constructor que usa el constructor de la clase base y añade el bono
    public EmpleadoTiempoCompleto(String nombre, double salario, double bono){
        super(nombre, salario); //Llamada al constructor de la clase base empleado
        this.bono = bono; //Inicializamos el bono
    }
    

    //Sobreescribimos el metodo para calcular el salario incluyendo el bono
    @Override
    public double calcularSalario(){
        return salario + bono; //Calculamos el salario sumando el bono base
    }
}

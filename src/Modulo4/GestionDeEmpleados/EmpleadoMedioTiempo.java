package Modulo4.GestionDeEmpleados;

public class EmpleadoMedioTiempo extends Empleado {

    private int horasTrabajadas; //Horas trabajadas por el empleado a medio tiempo

    private double tarifaPorHora; //Tarifa por hora del empleado

    //Constructor que el inicializa el nombre, la tarifa y las horas trabajas
    public EmpleadoMedioTiempo( String nombre, double tarifaPorHora, int horasTrabajadas ){
        super(nombre, tarifaPorHora * horasTrabajadas);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    //Sobre el metodo para calcular el salario basado en horas trabajas
    @Override
    public double calcularSalario(){
        return tarifaPorHora * horasTrabajadas; //Calculamos el salario en base a las horas trabajadas
    }
}

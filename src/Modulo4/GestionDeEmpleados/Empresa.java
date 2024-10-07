package Modulo4.GestionDeEmpleados;

//Clase principal
import javax.swing.*;

public class Empresa {
    
    public static void main(String[] args) {
        
        //Pedimos al rrhh cuantos empleados va a queres ingresar

        int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos empleados deseas registrar?"));
        
        //Creamos un array de empleados para almacenar los empleados registrados
        Empleado[] empleados = new Empleado[numeroEmpleados];

        //Recorrer el numero de empleados para pedir los datos y crearlos
        for ( int i = 0; i <numeroEmpleados; i++){

            //Pedimos a rrhh que ingrese el tipo de empleado
            String tipoEmpleado = JOptionPane.showInputDialog("¿El empleado es a tiempo completo o medio tiempo? (completo/medio)");


            //Si el empleado es a tiempo completo
            if( tipoEmpleado.equalsIgnoreCase("completo")){
                //Pedimos al usuario el nombre del empleado
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre del empleado a tiempo completo: ");

                //Pedimos el salario base
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario base del empleado a tiempo completo: "));
                //Pedimos el bono adicional
                double bono = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el bono del empleado a tiempo completo: "));

                //Creamos un objeto Empleado a tiempo completo con los datos ingresados
                empleados[i] = new EmpleadoTiempoCompleto(nombre, salario, bono);
            }else if( tipoEmpleado.equalsIgnoreCase("medio")){
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre del empleado a medio tiempo: ");

                //Pedimos la tarifa por hora
                double tarifaPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la tarifa por hora del empleado a medio tiempo: "));

                //Pedimos las horas trabajadas
                int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas del empleado a medio tiempo"));

                //Creamos un objeto Empleado a medio tiempo completo con los datos ingresados
                empleados[i] = new EmpleadoMedioTiempo(nombre, tarifaPorHora, horasTrabajadas);
            }

        }

        //Motramos los detalles de todos los empleados registrados
        for( Empleado emp : empleados){
            emp.mostrarDetalles(); //Usamos el polimorfismo para poder mostrar los detalles, es decir traemos y usamos mostrarDetalles(), siendo que la clase Empresa no es una sub clase directa dde Empleado
        }
    }
}

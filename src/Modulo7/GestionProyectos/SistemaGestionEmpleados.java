package Modulo7.GestionProyectos;

import java.util.*;
import java.util.function.Consumer;
import javax.swing.*;

public class SistemaGestionEmpleados {

    //Lista de empleados
    private List<Empleado> empleados;

    public SistemaGestionEmpleados() {
        empleados = new ArrayList<>();
    }

    //metodo para agregar un empleado
    @Operacion(descripcion = "Agregar un nuevo empleado")
    public void agregarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: "));

        String[] roles = {"GERENTE", "DESARROLLADOR", "TESTER"};

        String rolSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione el rol del empleado",
                "Roles", JOptionPane.QUESTION_MESSAGE, null, roles, roles[0]);
        RolEmpleado rol = RolEmpleado.valueOf(rolSeleccionado);
        Empleado nuevEmpleado = new Empleado(nombre, edad, rol);
        empleados.add(nuevEmpleado);
        System.out.println("Empleado agregar exitosamente");
    }

    //metodo para mostrar los empleados
    @Operacion(descripcion = "Mostrar empleados")
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Empleado e : empleados) {
                sb.append(e).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    //metodo para eliminar un empleado
    @Operacion(descripcion = "Eliminar un empleado")
    public void eliminarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado a eliminar: ");
        empleados.removeIf(e -> e.getNombre().equals(nombre));
        System.out.println("Empleado eliminado");
    }

    //metodo principal
    public static void main(String[] args) {

        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados();

        //crear un map que va a vincular una opción de menu con una operacion
        Map<Integer, Consumer<Void>> menuOpciones = new HashMap<>();
        menuOpciones.put(1, (v) -> sistema.agregarEmpleado());
        menuOpciones.put(2, (v) -> sistema.mostrarEmpleados());
        menuOpciones.put(3, (v) -> sistema.eliminarEmpleado());

        //menu principal
        boolean salir = false;

        while (!salir) {
            String opcion = JOptionPane.showInputDialog("Menu de gestión de empleados:\n"
                    + "1. Agregar empleado\n"
                    + "2. Mostar empleado\n"
                    + "3. Eliminar empleado\n"
                    + "4. Salir\n"
                    + "Seleccione una opción:");
            try {

                int opcionInt = Integer.parseInt(opcion);

                Consumer<Void> operacion = menuOpciones.get(opcionInt);

                if (operacion != null) {
                    operacion.accept(null);
                } else if (opcionInt == 4) {
                    salir = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            }
        }

    }

}

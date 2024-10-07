package Modulo4.EnciclopediaAnimal;

import javax.swing.*;

public class WikipediaAnimal {
    public static void main(String[] args) {

        int numeroAnimales = Integer
                .parseInt(JOptionPane.showInputDialog("¿Cuantos animales quiere ingresar a la wikipedia?"));

        Animal[] animales = new Animal[numeroAnimales];

        for (int i = 0; i < numeroAnimales; i++) {
            String tipo = JOptionPane.showInputDialog("¿Que tipo de animal es?");

            if (tipo.equalsIgnoreCase("perro")) {

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del perro: ");

                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del perro: "));

                animales[i] = new Perro(nombre, edad);
            } else if (tipo.equalsIgnoreCase("gato")) {

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del gato: ");

                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del gato: "));

                animales[i] = new Gato(nombre, edad);
            } else if (tipo.equalsIgnoreCase("pajaro")) {

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del pajaro: ");

                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del pajaro: "));

                animales[i] = new Pajaro(nombre, edad);
            }
        }

        // Recorremos el array de animales para mostrar los detalles y emitir el sonido
        for (Animal animal : animales) {

            animal.mostrarInfo();
            
            animal.emitirSonido();

            System.out.println();

        }

    }
}

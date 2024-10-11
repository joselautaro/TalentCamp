package Modulo6.Biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

public class Biblioteca {

    private HashMap<String, Usuario> usuarios;

    private ArrayList<Libro> libros;

    public Biblioteca() {
        usuarios = new HashMap<>();
        libros = new ArrayList<>();
    }

    public void agregarUsuario() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario: ");
        String id = JOptionPane.showInputDialog("Ingrese el id del usuario: ");
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de usuario (estudiante/profesor): ");

        System.out.println("Usuario agregado: " + nombre + "\n, ID: " + id + "\n, Tipo: " + tipo);

        Usuario usuario = new Usuario(nombre, id, tipo);
        usuarios.put(id, usuario);
        JOptionPane.showMessageDialog(null, "Usuario agregado con éxito");
    }

    public void agregarLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro: ");

        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro: ");

        System.out.println("Libro agregado: " + titulo + " por " + autor);

        Libro libro = new Libro(titulo, autor);
        libros.add(libro);
    }

    public void prestarLibro() {
        try {
            String idUsuario = JOptionPane.showInputDialog("Ingrese el id del usuario que va a tomar el libro: ");
            Usuario usuario = buscarUsuario(idUsuario);

            String tituloLibro = JOptionPane.showInputDialog("Ingrese el titulo del libro a prestar: ");
            Libro libro = buscarLibro(tituloLibro);

            System.out.println("Libro a prestar: " + tituloLibro + " al usuario " + usuario.getNombre());

            if (libro.isDisponible()) {
                libro.prestar();
                JOptionPane.showMessageDialog(null, "El libro ha sido prestado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "El libro ya está prestado");
            }
        } catch (UsuarioNoRegistradoException | LibroNoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void devolverLibro() {
        try {
            String tituloLibro = JOptionPane.showInputDialog("Ingrese el titulo del libro a devolver: ");
            Libro libro = buscarLibro(tituloLibro);

            System.out.println("Libro devuelto");
            libro.devolver();
            JOptionPane.showMessageDialog(null, "El libro ha sido devuelvo con éxito");
        } catch (LibroNoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // metodo para buscar libro
    private Usuario buscarUsuario(String id) throws UsuarioNoRegistradoException {
        Usuario usuario = usuarios.get(id);
        if (usuarios == null) {
            throw new UsuarioNoRegistradoException("Error: usuario no registrado");
        }
        return usuario;
    }

    // metodo para buscar libro
    private Libro buscarLibro(String titulo) throws LibroNoEncontradoException {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        throw new LibroNoEncontradoException("Error: Libro no encontrado");
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        boolean salir = false;

        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de la biblioteca:\n" +
                            "1. Agregar usuario\n" +
                            "2. Agregar Libro\n" +
                            "3. Prestar libro\n" +
                            "4. Devolver libro\n" +
                            "5. Salir\n" +
                            "Ingrese la opción:");
            switch (opcion) {
                case "1":
                    biblioteca.agregarUsuario();
                    break;
                case "2":
                    biblioteca.agregarLibro();
                    break;
                case "3":
                    biblioteca.prestarLibro();
                    break;
                case "4":
                    biblioteca.devolverLibro();
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        }
    }

}

package Modulo7.RedSocial;

import javax.swing.*;

import java.util.*;

public class RedSocial {
    // inicializamos el array list para usuarios
    private List<Usuario> usuarios;

    // metodo constructor
    public RedSocial() {
        this.usuarios = new ArrayList<>();
    }

    // metodo para registrar un usuario
    public void registrarUsuarios() {
        // Solicitamos el nombre del usuario a registrar
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");

        // Uso de JComboBox para seleccionar el tipo de usuario
        String[] opcionesUsuario = { "NORMAL", "ADMIN" };
        String tipo = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de usuario:",
                "Tipo de usuario",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesUsuario,
                opcionesUsuario[0] // selección por defecto
        );
        // mostrar los datos ingresados en la consola
        System.out.println("Registrando usuario: " + nombre + ", Tipo: " + tipo);

        // uso de operador ternario para seleccionar el tipo de usuario
        Usuario nuevoUsuario = tipo.equalsIgnoreCase("NORMAL")
                ? new UsuarioNormal(nombre)
                : tipo.equalsIgnoreCase("ADMIN")
                        ? new Administrador(nombre)
                        : null;

        // Verificamos si el usuario no es null
        if (nuevoUsuario != null) {
            usuarios.add(nuevoUsuario);
            System.out.println("Usuario registrado: " + nuevoUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Error el registra el usuario");
        }
    }

    // metodo para publica un mensaje
    public void publicarMensaje() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        Usuario usuario = buscarUsuario(nombre);

        if (usuario != null) {
            String contenido = JOptionPane.showInputDialog("Escriba su publicación: ");

            String tipo = JOptionPane.showInputDialog("Tipo de publicación (TEXTO/IMAGEN/VIDEO):");

            System.out.println(nombre + " va a publicar: " + contenido + " (" + tipo + ")");

            try {
                TipoPublicacion tipoPublicacion = TipoPublicacion.valueOf(tipo.toUpperCase());
                usuario.publicar(contenido, tipoPublicacion);

                if (tipoPublicacion == TipoPublicacion.TEXTO) {
                    int palabras = usuario.contarPalabras(contenido);
                    System.out.println("La publicación tine " + palabras + " palabras");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de publicación no válido");
            }
        } else {
            System.out.println("Usuario no encontrado " + nombre);
        }
    }

    // metodo para buscar un usuario
    public Usuario buscarUsuario(String nombre) {
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
        if (usuario != null) {
            System.out.println("Usuario encontrado: " + usuario.getNombre());
        } else {
            System.out.println("Usuario no encontrado: " + nombre);
        }
        return usuario;
    }

    // metodo para seguir al usuario
    public void seguirUsuario() {
        String seguidorNombre = JOptionPane.showInputDialog("Ingrese su nombre como seguidor: ");
        String seguidoNombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario a seguir: ");

        System.out.println(seguidorNombre + " quiere seguir a " + seguidoNombre);

        Usuario seguidor = buscarUsuario(seguidorNombre);
        Usuario seguido = buscarUsuario(seguidoNombre);

        try {
            if (seguidor != null && seguido != null) {
                seguidor.seguir(seguido);
                System.out.println(seguidorNombre + " sigue a " + seguidoNombre);
            } else {
                throw new UsuarioNoEncontradoException("Usuario no encontrado");
            }
        } catch (UsuarioNoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // metodo para obtener administradores
    public List<Usuario> obtenerAdministradores() {
        List<Usuario> adminitradores = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Administrador) {
                adminitradores.add(usuario);
            }
        }
        return adminitradores;
    }

    // metodo para mostrar las publicaciones
    public void mostrarPublicaciones() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
        Usuario usuario = buscarUsuario(nombre);

        if (usuario != null) {
            System.out.println("Mostrando publicaciones de " + nombre);
            usuario.mostrarPublicaciones();
        } else {
            System.out.println("Uusuario no encontrado: " + nombre);
        }
    }

    // metodo para eliminar las publicaciones
    public void eliminarPublicacionesAdministrador() {
        // Obtener lista de administradores
        List<Usuario> administradores = obtenerAdministradores();

        // Llenar el JComboBox con los nombres del los administradores
        String[] nombreAdmins = administradores.stream()
                .map(Usuario::getNombre)
                .toArray(String[]::new);

        if (nombreAdmins.length == 0) {
            System.out.println("No hay administradores disponibles");
        }

        String nombreAdminSeleccionado = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione un administrador:",
                "Administradores",
                JOptionPane.QUESTION_MESSAGE,
                null,
                nombreAdmins,
                nombreAdmins[0] // selección por defecto
        );

        if (nombreAdminSeleccionado != null) {
            Usuario admin = buscarUsuario(nombreAdminSeleccionado);

            System.out.println("Intentando eliminar publicación como administrador: " + nombreAdminSeleccionado);

            if (admin instanceof Administrador) {
                String nombreUsuario = JOptionPane
                        .showInputDialog("Ingrese el nombre del usuario que desea gestionar: ");

                Usuario usuario = buscarUsuario(nombreUsuario);

                if (usuario != null) {
                    ((Administrador) admin).eliminarPublicacion(usuario);
                    System.out.println("Publicación eliminada del usuario: " + nombreUsuario);
                } else {
                    System.out.println("Usuario no encontrado");
                }
            } else {
                System.out.println("Administrador no encontrado");
            }
        } else {
            System.out.println("No se seleccionó un administrador");
        }
    }

    public static void main(String[] args) {
        RedSocial redSocial = new RedSocial();

        Map<Integer, Runnable> menuOpciones = new HashMap<>();

        menuOpciones.put(1, redSocial::registrarUsuarios);
        menuOpciones.put(2, redSocial::publicarMensaje);
        menuOpciones.put(3, redSocial::mostrarPublicaciones);
        menuOpciones.put(4, redSocial::seguirUsuario);
        menuOpciones.put(5, redSocial::eliminarPublicacionesAdministrador);

        boolean salir = false;
        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de red social:\n" +
                            "1. Registrar usuario\n" +
                            "2. Publicar mensaje\n" +
                            "3. Mostrar publicaciones\n" +
                            "4. Seguir a usuario\n" +
                            "5. Eliminar publicaciones (ADMIN)\n" +
                            "6. Salir\n" +
                            "Seleccione una opción:");

            try {
                int opcionInt = Integer.parseInt(opcion);

                Runnable operacion = menuOpciones.get(opcionInt);

                if (operacion != null) {
                    operacion.run();
                } else if (opcionInt == 6) {
                    salir = true;
                    System.out.println("Saliendo del sistema");
                } else {
                    System.out.println("Opción no valida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error, ingrese un numero valido" + e);
            }
        }
    }
}

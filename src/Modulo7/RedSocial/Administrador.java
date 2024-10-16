package Modulo7.RedSocial;

import javax.swing.*;

public class Administrador extends Usuario{
    public Administrador(String nombre){
        super(nombre);
    }

    public void mostrarDetalles(){
        System.out.println("Administrador: " + nombre);
    }

    //Eliminar la publicación de un usuario dado su indice
    public void eliminarPublicacion(Usuario usuario, int index){
        if( index >= 0 && index < usuario.publicaciones.size()){
            usuario.publicaciones.remove(index);
            usuario.tiposPublicacion.remove(index);
            System.out.println("Publicación eliminada por el administrador");
        }else{
            System.out.println("Indice de publicación invalida");
        }
    }

    //elimina un mensaje de cualquier usuario seleccionando el mensaje a eliminar
    public void eliminarPublicacion(Usuario usuario){
        StringBuilder menu = new StringBuilder();
        for( int i = 0; i < usuario.publicaciones.size(); i++ ){
            menu.append(i).append(". ").append(usuario.publicaciones.get(i)).append("\n");
        }
        String opcion = JOptionPane.showInputDialog("Seleccione la publicación a eliminar:\n" + menu.toString());
        int index = Integer.parseInt(opcion);
        eliminarPublicacion(usuario, index);
    }
}

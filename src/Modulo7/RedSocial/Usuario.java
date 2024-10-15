package Modulo7.RedSocial;

import java.util.*;

abstract class Usuario implements Publicable{
    protected String nombre;
    protected List<String> seguidores;
    protected List<String> publicaciones;
    protected List<TipoPublicacion> tiposPublicacion;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.seguidores = new ArrayList<>();
        this.publicaciones = new ArrayList<>();
        this.tiposPublicacion = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public void seguir(Usuario usuario) throws UsuarioNoEncontradoException{
        if(usuario == null){
            throw new UsuarioNoEncontradoException("Usuario no encontrado");
        }
        seguidores.add(usuario.getNombre());
    }

    @Override
    public void publicar(String contenido, TipoPublicacion tipo){
        publicaciones.add("["+ tipo + "]" + contenido);
        tiposPublicacion.add(tipo);
        System.out.println(nombre + " publicó: " + contenido);
    }

    @Override
    public int contarPalabras(String contenido){
        if(contenido == null || contenido.isEmpty()){
            return 0;
        }
        return contenido.split("\\s+").length;
    }

    public void mostrarPublicaciones(){
        System.out.println("Publicaciones de: " + nombre + ":");
        for( String pub : publicaciones ){
            System.out.println(pub);
        }
    }

    public void mostrarPerfil(){
        System.out.println("Perfil de usuario: "+nombre);
        System.out.println("Seguidores: " + seguidores.size());
    }
    public abstract void mostrarDetalles();
}

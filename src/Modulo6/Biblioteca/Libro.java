package Modulo6.Biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; //Por defecto está disponible
    }

    public String getTitulo(){
        return titulo;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public void prestar(){
        disponible = false; //Cambiar la disponilidad del libro
    }

    public void devolver(){
        disponible = true; //Marca el libro como disponible
    }

    public void mostrarDetalles(){
        System.out.println("Libro: " + titulo + " - Autor: " + autor + " - Disponible: " + (disponible ? "Si" : "NO"));
    }
    
}

package Modulo2P2;
//Modificacion y eliminacion de contenido
public class Ejemplo3 {
    public static void main(String[] args) {
        StringBuffer  buffer = new StringBuffer("Hola Mundo");

        //Reemplazar parte del contenido
        buffer.replace(5, 10, "java");
        System.out.println("Despues del replace: " + buffer);

        //Eliminar parde del contenido
        buffer.delete(4, 8);
        System.out.println("Despues del delete: " + buffer);
    }
}

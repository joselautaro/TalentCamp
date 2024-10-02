package Modulo2P2;

//append(): Añade caracteres al final del buffer
//insert(): insertar caracteres en una posición especifica.
//replace(): reemplaza una porcion de la secuencia de caracteres
//delete(): elimina caracteres en un rango especifico
//reverse(): invierte la secuencia de caracteres


public class Ejemplo2 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hola");

        //Añadimos mas texto al final del buffer
        buffer.append(" Mundo");
        System.out.println("Despues del append: " + buffer);

        //Insertar texto en una posicion especifica
        buffer.insert(5, "Java ");
        System.out.println("Despues del insert: " + buffer);
    }
}

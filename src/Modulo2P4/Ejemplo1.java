package Modulo2P4;

// Scope de varianbles locales

public class Ejemplo1 {
    public void mostraNuevo(){
         int numero = 10; //esta variable solo se ejecuta dentro de este metodo
        System.out.println("El numero es: " + numero);
    }

    public void otroMetodo(){
        // No vamos a poder acceder a la variable
    }
}

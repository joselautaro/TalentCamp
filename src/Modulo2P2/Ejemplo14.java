package Modulo2P2;

// Bucle pueda llegar a buscar un numero en un array


public class Ejemplo14 {
        public static void main(String[] args) {
            int [] numeros = {5, 8, 61, 46, 96, 12};

            int buscar = 12;

            int i = 0;

            boolean encontrado = false;

            while( i < numeros.length && !encontrado ){
                if( numeros[i]  == buscar){
                    encontrado = true;
                }
                i++;
            }
            if(encontrado){
                System.out.println("Numero encontrado");
            }else{
                System.out.println("Numero no encontrado");
            }
        }    
}

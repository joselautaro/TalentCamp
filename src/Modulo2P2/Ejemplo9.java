package Modulo2P2;

//Arrays multidimensionales


public class Ejemplo9 {
    public static void main(String[] args) {

        int [][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Elemento en[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
        matriz[1][1] = 99;
        System.out.println("Nuevo valor en [1][1] = " + matriz[1][1]);
    }
}

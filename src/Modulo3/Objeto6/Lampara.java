package Modulo3.Objeto6;

public class Lampara {

    boolean encendida;

    // Metodo para cambiar el estado de la lampara
    public void cambiarEstado(){
        encendida = !encendida;
    }

    // Mostrar el estado de la lampara
    public String estadoLampara(){
        return encendida ? "encendida" : "apagada";
    }
    
}

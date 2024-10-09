package Modulo4.InterDispositivosElectronicos;

public class Computadora implements Dispositivo{

    private String tipo;

    public Computadora (String tipo){
        this.tipo = tipo;
    }

    @Override
    public void encender(){
            System.out.println("La computadora " + tipo + " está encendida.");
    }
    @Override
    public void apagar(){
            System.out.println("La computadora " + tipo + " está apagada.");
    }
    
}

package Modulo4.InterDispositivosElectronicos;

public class Televisor implements Dispositivo {
    private String marca;

    public Televisor(String marca){
        this.marca = marca;
    }

    @Override
    public void encender(){
            System.out.println("El televisor " + marca + " está encendido.");
    }
    @Override
    public void apagar(){
            System.out.println("El televisor " + marca + " está apagado.");
    }
}

package Modulo4.InterDispositivosElectronicos;

public class Celular implements Dispositivo{
        private String modelo;

        public Celular(String modelo){
            this.modelo = modelo;
        }

        @Override
        public void encender(){
            System.out.println("El celular " + modelo + " está encendido.");
        }

        @Override
        public void apagar(){
            System.out.println("El celular " + modelo + " está apagado");
        }
}



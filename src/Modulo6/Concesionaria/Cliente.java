package Modulo6.Concesionaria;

public class Cliente extends Persona{
    private String telefono;

    public Cliente(String nombre, String direccion, String telefono){
        super(nombre, direccion);
        this.telefono = telefono;
    }

    public String getTelefono(){
        return telefono;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Cliente: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono);
    }
}

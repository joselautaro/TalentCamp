package Modulo3.TiendaDigital;

// Representa al usuario final que compra en la tienda
public class Cliente {
    
    // Atributos privados
    private String nombre;

    private String direccion;

    private String telefono;

    // Constructor para inicializar los atributos del cliente
    public Cliente(String nombre, String direccion, String telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    // Generamos los getters necesarios para poder obtener la informacion del cliente en nuestro programa
    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getTelefono(){
        return telefono;
    }

}

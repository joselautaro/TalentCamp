package Modulo7.EmpreTalent;

public class Electronica extends Producto{
    private int garantiaMeses;

    public Electronica(String nombre, double precio, int cantidad, int garantiaMeses){
        super(nombre, precio, cantidad, CategoriaProducto.ELECTRONICA);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    //metodo para mostrar la informacion adicional
    @Override
    public String toString(){
        return super.toString() + ",\n Garantía: " + garantiaMeses + " meses";
    }
}

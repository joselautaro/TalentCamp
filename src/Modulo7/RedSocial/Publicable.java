package Modulo7.RedSocial;

public interface Publicable {
    void publicar(String contenido, TipoPublicacion tipo);
    int contarPalabras(String contenido);
}

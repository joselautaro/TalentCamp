package Modulo7.GestionProyectos;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Definimos de la anotación personalizada para marcar métodos
@Retention(RetentionPolicy.RUNTIME)
@interface Operacion {
    String descripcion();
}

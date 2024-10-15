package Modulo7.EmpreTalent;
import java.lang.annotation.*;
// import java.lang.annotation.RetentionPolicy;

//Anotacion para operaciones en la tienda
@Retention(RetentionPolicy.RUNTIME)
@interface OperacionSegura {
    String descripcion();
}

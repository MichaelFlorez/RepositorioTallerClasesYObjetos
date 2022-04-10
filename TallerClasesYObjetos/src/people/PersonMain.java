package people;
import java.util.Date;

/**
 * Clase que ejecuta el sistema de impresion de informacion personal de personas.
 * @author Michael Florez Rico
 */
public class PersonMain {
    public static void main(String[] args) {

        System.out.println("Information for person 1: ");
        //Creación del objeto persona 1 p1 con valores por defecto.
        Person p1 = new Person();
        p1.showFullName(); //Ejecucion del método de impresion para el nombre completo.
        p1.showDateBirth(); //Ejecucion del método de impresion para la fecha de nacimiento.
        p1.showHeight(); //Ejecucion del método de impresión para la estatura.

        System.out.println();

        System.out.println("Information for person 2: ");
        //Creación del objeto persona 2 p2 con valores definidos.
        Person p2 = new Person("Laura","Perez","Lopez",new Date("08/11/1990"), 1.65F);
        p2.showFullName(); //Ejecucion del método de impresión para el nombre completo.
        p2.showDateBirth(); //Ejecucion del método de impresión para la fecha de nacimiento.
        p2.showHeight(); //Ejecucion del método de impresión para la estatura.

    }
}

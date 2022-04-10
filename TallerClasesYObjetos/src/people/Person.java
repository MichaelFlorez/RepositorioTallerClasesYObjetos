package people;
import java.util.Date;
/**
 * Representa un sistema de impresión de información personal de personas.
 * @author Michael Florez Rico
 */
public class Person {
    //1.Variables nativas de la clase
    public String name; //Variable nombre.
    public String lastName1; //Variable primer apellido.
    public String lastName2; //Variable segundo apellido.
    public Date dateBirth; //Variable fecha de nacimiento.
    public float height; //Variable estatura.


    //2.Constructores
     /**
     * Constructor vacío para asignan valores a las variables por defecto.
     */
    public Person(){
        name = "Michael";
        lastName1 = "Florez";
        lastName2 = "Rico";
        dateBirth = new Date("05/17/1995");
        height = 1.72F;
    }

    /**
     * Constuctor sobrecargado, para proteger las variables nativas de la clase.
     * @param name //Variable nombre.
     * @param lastName1 //Variable primer apellido.
     * @param lastName2 //Variable segundo apellido.
     * @param dateBirth //Variable fecha de nacimiento.
     * @param height //Variable estatura.
     */
    public Person(String name,String lastName1,String lastName2,Date dateBirth,float height){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    //3. Metodos

    /**
     * Método get para obtener el nombre de la persona.
     * @return nombre de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     * Método set para asignar el nombre de la persona.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para mostrar el nombre completo de la persona.
     */
    public void showFullName(){
        System.out.println("His/her full name is: " + name + " " + lastName1 + " " + lastName2);
    }

    /**
     * Método para mostrar la fecha de nacimiento de la persona.
     */
    public void showDateBirth(){
        System.out.println("His/her date of birth: " + dateBirth);
    }

    /**
     * Método para mostrar la estatura de la persona.
     */
    public void showHeight(){
        System.out.println("His/her heigt is: " + height + " meters");
    }
}



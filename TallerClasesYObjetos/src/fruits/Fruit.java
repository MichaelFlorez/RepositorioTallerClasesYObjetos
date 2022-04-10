package fruits;

import java.util.ArrayList;
/**
 * Representa un sistema de impresión de información media de frutas.
 * @author Michael Florez Rico
 */
public class Fruit {
    //1.Variables nativas de la clase
    public String name; //Variable nombre.
    private float averageWeight; //Variable peso promedio.
    public ArrayList<String> colors; //Arreglo de colores.

    //2.Constructor

    /**
     *Constuctor sobrecargado, para proteger las variables nativas de la clase.
     * @param name //Variable nombre.
     * @param averageWeight //Variable peso promedio.
     */
    public Fruit(String name, float averageWeight){
        this.name = name;
        this.averageWeight = averageWeight;
    }

    //3. Metodos

    /**
     * Método get para obtener el arreglo de colores.
     * @return arreglo de colores.
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }

    /**
     * Método set para asignar los colores del arreglo.
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Método toString
     * @return resumen de datos de la fruta.
     */
    @Override
    public String toString() {
        return
                "Name= " + name + '\n' +
                "Average Weight= " + averageWeight + "kg" + '\n'+
                "Colors= " + colors;

    }

}

package fruits;

import java.util.ArrayList;
/**
 * Clase que ejecuta el sistema de impresion de información media de frutas.
 * @author Michael Florez Rico
 */
public class FruitMain {
    public static void main(String[] args) {
        //Creación de objeto fruta 1 f1.
        Fruit f1 = new Fruit("Apple",0.5F);
        //Creación de arreglo de colores de la fruta 1.
        f1.colors = new ArrayList<String>(4);
        //Adición de datos al arreglo de colores.
        f1.colors.add("Red");
        f1.colors.add("Green");
        f1.colors.add("Yellow");
        //Impresion se información para la fruta 1.
        System.out.println("Information fruit 1 (f1): ");
        System.out.println(f1);
        System.out.println();

        //Creación de objeto fruta 2 f2.
        Fruit f2 = new Fruit("Grape", 0.02F);
        //Creación de arreglo de colores de la fruta 2.
        f2.colors = new ArrayList<>(4);
        //Adición de datos al arreglo de colores.
        f2.colors.add("Green");
        f2.colors.add("Purple");
        f2.colors.add("Red");
        //Impresion se información para la fruta 2.
        System.out.println("Information fruit 2 (f2): ");
        System.out.println(f2);

    }
}

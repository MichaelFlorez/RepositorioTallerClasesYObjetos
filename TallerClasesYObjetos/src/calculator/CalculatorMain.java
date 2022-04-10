package calculator;
/**
 * Clase que ejecuta el sistema de cálculo de operaciones matemáticas básicas.
 * @author Michael Florez Rico
 */
public class CalculatorMain {
    public static void main(String[] args) {
        //Creación de objeto para cálculo de variables a=3,b=5.
        Calculator calculation1 = new Calculator(3,5);
        //Impresión de resultados para las variables del objeto.
        System.out.println("Sean a = " + calculation1.getA() + " y b = " + calculation1.getB());
        System.out.println(calculation1);
        System.out.println();

        //Creación de objeto para cálculo de variables a=8,b=7.
        Calculator calculation2 = new Calculator(8,7);
        //Impresión de resultados para las variables del objeto.
        System.out.println("Sean a = " + calculation2.getA() + " y b = " + calculation2.getB());
        System.out.println(calculation2);


    }
}

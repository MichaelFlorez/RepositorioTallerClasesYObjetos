package calculator;
/**
 * Clase que ejecuta el sistema de cálculo de operaciones matemáticas básicas.
 * @author Michael Florez Rico
 */
public class Calculator {
    //1. Variables de la clase
    private int a; //Variable operando a.
    private int b; //Variable operando b.
    //2. Constructores

    /**
     * Constuctor sobrecargado, para proteger las variables nativas de la clase.
     * @param a //Variable operando a.
     * @param b //Variable operando b.
     */
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    //3. Métodos

    /**
     * Método suma
     * @return suma de a+b.
     */
    public int sum(){
        int sum = this.a + this.b;
        return sum;
    }

    /**
     * Método resta
     * @return resta de a-b.
     */
    public int subtract(){
        int subtraction = this.a - this.b;
        return subtraction;
    }

    /**
     * Método multiplicación
     * @return multiplicación de a*b.
     */
    public int multiply(){
        int multiply = this.a * this.b;
        return multiply;
    }
    /**
     * Método división
     * @return división de a/b.
     */
    public double divide(){
        if(b != 0) {
            double divide = (double) this.a / (double) this.b;
            return divide;
        }else{
            System.out.println("Division error, It is not possible to divide by 0!!!!");
        }
        return 0;
    }

    /**
     * Método get para obtener el operando a.
     * @return operando a.
     */
    public int getA() {
        return a;
    }

    /**
     * Método set para asignar el operando a.
     * @param a
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Método get para obtener el operando b.
     * @return operando b.
     */
    public int getB() {
        return b;
    }

    /**
     * Método set para asignar el operando b.
     * @param b
     */
    public void setB(int b) {
        this.b = b;
    }
    /**
     * Método toString
     * @return resumen de datos operaciones con su respectivo resultado.
     */
    @Override
    public String toString() {
        return a + " + " + b + " = " + sum() + "\n" +a + " - " + b + " = " + subtract() + "\n" + a + " * " + b + " = " + multiply() + "\n" +a + " / " + b + " = " + divide() + "\n";
    }
}

package bankAccounts;
/**
 * Clase que ejecuta el sistema de impresión de información de clientes de cuentas bancarias.
 * @author Michael Florez Rico
 */
public class Customer extends BankAccount{

    //1.Variables nativas de la clase
    private String name; //Variable nombre de cliente.
    private String lastName1; //Variable primer apellido de cliente.
    private String lastName2; //Variable segundo apellido de cliente.
    private int idCustomer; //Variable identificador de cliente.
    private static int counterCostumer; //Contador de clientes

    //2.Constructor

    /**
     * Constuctor sobrecargado, para proteger las variables nativas de la clase.
     * @param name //Variable nombre de cliente.
     * @param lastName1 //Variable primer apellido de cliente.
     * @param lastName2 //Variable segundo apellido de cliente.
     * @param accountNumber //Variable número de cuenta
     * @param activated //Variable de activacion de cuenta.
     */
    public Customer(String name, String lastName1, String lastName2, int accountNumber, boolean activated){
        super(accountNumber);
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.idCustomer = 100 + ++counterCostumer;
        this.activated = activated;

    }

    /**
     * Método get para obtener nombre del cliente.
     * @return nombre del cliente.
     */
    public String getName() {
        return name;
    }

    /**
     * Método set para asignar nombre del cliente.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método get para obtener primer apellido del cliente.
     * @return primer apellido del cliente.
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Método set para asignar primer apellido del cliente.
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Método get para obtener segundo apellido del cliente.
     * @return segundo apellido del cliente.
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Método set para asignar segundo apellido del cliente.
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Método get para obtener identificacion del cliente.
     * @return primer apellido del cliente.
     */
    public int getIdCustomer() {
        return idCustomer;
    }

    /**
     * Método toString
     * @return resumen de datos, cuenta - cliente
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nActivated= " + activated +
                "\nCustomer's name= " + name + ' ' + lastName1 + ' ' + lastName2 + ' ' +
                "\nCustomer's ID= " + idCustomer;
    }
}

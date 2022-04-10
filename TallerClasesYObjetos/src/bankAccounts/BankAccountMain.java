package bankAccounts;
/**
 * Clase que ejecuta el sistema de impresion de información cuentas bancarias.
 * @author Michael Florez Rico
 */
public class BankAccountMain {

    public static void main(String[] args) {
        //Creación de cliente 1.
        Customer customer1 = new Customer("Luis","Lopez", "Perez", 44444,true);
        System.out.println("Information for customer1: \n" + customer1);
        System.out.println();

        //Creación de cliente 2.
        Customer customer2 = new Customer("Tatiana","Gutierrez", "Pedregal", 88884,false);
        System.out.println("Information for customer2: \n" + customer2);

    }
}

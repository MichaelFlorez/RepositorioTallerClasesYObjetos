package bankAccounts;
/**
 * Clase que ejecuta el sistema de impresión de información de cuentas bancarias.
 * @author Michael Florez Rico
 */
public class BankAccount {
    //1.Variables de la clase
    private int accountNumber; //Variable número de cuenta.
    protected boolean activated; //Variable de activacion de cuenta.

    //2.Constructor

    /**
     * Constuctor sobrecargado, para proteger las variables nativas de la clase.
     * @param accountNumber
     */
    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    /**
     * Método get para obtener activacion de cuenta.
     * @return booleano de activación de cuenta.
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Método set para asignar valor de activacion de cuenta.
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Método toString
     * @return resumen de datos de cuenta.
     */
    @Override
    public String toString() {
        return
                "Account Number= " + accountNumber;

    }
}

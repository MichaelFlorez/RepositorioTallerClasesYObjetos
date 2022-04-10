package flight;
/**
 * clase que ejecuta sistema de impresión de información de vuelos.
 * @author Michael Florez Rico
 */
public class FlightMain {
    public static void main(String[] args) {
        //Creación de objeto para vuelo 1.
        Flight flight1 = new Flight("Avianca", "FA503","Bogota,CO","Medellin, Co");
        //Impresión para la información del objeto del vuelo 1.
        System.out.println(flight1);
        System.out.println();

        //Creación de objeto para vuelo 2.
        Flight flight2 = new Flight("Viva Colombia", "SS504","Medellín, Co","Cali, Co");
        //Impresión para la información del objeto del vuelo .
        System.out.println(flight1);

    }
}

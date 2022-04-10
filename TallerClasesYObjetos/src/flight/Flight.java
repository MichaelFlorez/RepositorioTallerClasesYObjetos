package flight;
/**
 * Representa un sistema de impresión de información de vuelos.
 * @author Michael Florez Rico
 */
public class Flight {
    private String airline; //Variable aerolinea.
    private String flightNumber; //Variable número de vuelo.
    private String origin; //Variable Origen.
    private String destination; //Variable destino.

    //2. Constructor

    /**
     * Constuctor sobrecargado, para proteger las variables nativas de la clase.
     * @param airline //Variable aerolinea.
     * @param flightNumber //Variable número de vuelo.
     * @param origin //Variable Origen.
     * @param destination //Variable destino.
     */
    public Flight(String airline,String flightNumber,String origin, String destination){
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }

    /**
     * Método get para obtener el nombre de la aerolinea.
     * @return nombre de la aerolinea.
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Método set para asignar el nombre de la aerolinea
     * @param airline
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * Método get para obtener el número del vuelo.
     * @return número del vuelo.
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Método set para asignar el número del vuelo.
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * Método get para obtener origen del vuelo.
     * @return
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Método set para asignar origen del vuelo.
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Método get para obtener destino del vuelo.
     * @return
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Método set para asignar destino del vuelo.
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Método toString
     * @return resumen de datos del vuelo.
     */
    @Override
    public String toString() {
        return "Flight information: \n"+
                "Airline= " + airline + '\n' +
                "Flight Number= " + flightNumber + '\n' +
                "Origin= " + origin + '\n' +
                "Destination= " + destination;
    }
}

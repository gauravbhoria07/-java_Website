// Airplane.java
import java.time.LocalTime;

 class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime departureTime;

    public Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String checkFlightStatus() {
        // Logic to check if the flight is on time or delayed
        return "On Time";
    }

    public void delayFlight() {
        // Logic to delay the flight
    }
}

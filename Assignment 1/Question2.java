import java.util.*;

abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    public Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public double getFare() {
        return fare;
    }

    abstract double calculateFare();

    public String toString() {
        return "Flight No: " + flightNumber +
               " Airline: " + airline +
               " Fare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {
    public DomesticFlight(String number, String airline, double fare) {
        super(number, airline, fare);
    }

    double calculateFare() {
        return getFare() + getFare() * 0.10;
    }
}

class InternationalFlight extends Flight {
    public InternationalFlight(String number, String airline, double fare) {
        super(number, airline, fare);
    }

    double calculateFare() {
        return getFare() + getFare() * 0.25;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter flight type,number,airline,fare");

            String[] data = sc.nextLine().split(",");

            Flight flight;

            if (data[0].equalsIgnoreCase("Domestic")) {
                flight = new DomesticFlight(
                    data[1],
                    data[2],
                    Double.parseDouble(data[3])
                );
            } else {
                flight = new InternationalFlight(
                    data[1],
                    data[2],
                    Double.parseDouble(data[3])
                );
            }

            System.out.println(flight);
        }

        sc.close();
    }
}


  
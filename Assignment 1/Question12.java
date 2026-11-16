import java.util.*;

class Vehicle {
    protected String regNo;
    protected String brand;
    protected double baseRate;

    public Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {
    public Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    public double calculateRent() {
        return baseRate * 1.5;
    }
}

class Bike extends Vehicle {
    public Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    public double calculateRent() {
        return baseRate * 1.2;
    }
}

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            String[] data = sc.nextLine().split(",");

            String type = data[0];
            String regNo = data[1];
            String brand = data[2];
            double baseRate = Double.parseDouble(data[3]);

            Vehicle vehicle;

            if (type.equalsIgnoreCase("Car")) {
                vehicle = new Car(regNo, brand, baseRate);
            } else {
                vehicle = new Bike(regNo, brand, baseRate);
            }

            System.out.println(
                type + " " + regNo + " " +
                brand + " Rent: " +
                vehicle.calculateRent()
            );
        }

        sc.close();
    }
}
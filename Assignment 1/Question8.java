import java.util.*;

abstract class Loan {
    protected double principal;
    protected double rate;
    protected double time;

    public Loan(double principal, double time) {
        this.principal = principal;
        this.time = time;
    }

    abstract double calculateInterest();
}

class HomeLoan extends Loan {
    public HomeLoan(double principal, double time) {
        super(principal, time);
        rate = 8;
    }

    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class CarLoan extends Loan {
    public CarLoan(double principal, double time) {
        super(principal, time);
        rate = 10;
    }

    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            String[] data = sc.nextLine().split(",");

            String type = data[0];
            double principal = Double.parseDouble(data[1]);
            double time = Double.parseDouble(data[2]);

            Loan loan;

            if (type.equalsIgnoreCase("Home")) {
                loan = new HomeLoan(principal, time);
                System.out.println(
                    "Home Loan Interest: " +
                    loan.calculateInterest()
                );
            } else {
                loan = new CarLoan(principal, time);
                System.out.println(
                    "Car Loan Interest: " +
                    loan.calculateInterest()
                );
            }
        }

        sc.close();
    }
}
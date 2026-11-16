import java.util.*;

class Account {
    private String accNo;
    private String holderName;
    private double balance;

    public Account(String accNo, String holderName) {
        this.accNo = accNo;
        this.holderName = holderName;
        balance = 0;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Account account = new Account("A101", "User");

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            String[] data = command.split(" ");

            if (data[0].equalsIgnoreCase("deposit")) {
                account.deposit(
                    Double.parseDouble(data[1])
                );

            } else if (data[0].equalsIgnoreCase("withdraw")) {
                account.withdraw(
                    Double.parseDouble(data[1])
                );

            } else if (data[0].equalsIgnoreCase("getBalance")) {
                System.out.println(
                    "Balance: " + account.getBalance()
                );
            }
        }

        sc.close();
    }
}
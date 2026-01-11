import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Method to open account
    void openAccount(String name, int accNo, double initialBalance) {
        accountHolder = name;
        accountNumber = accNo;
        balance = initialBalance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display details
    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}

public class TW4_ClassMemberMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();

        // Reading input from keyboard
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        // Opening account
        acc.openAccount(name, accNo, bal);

        System.out.print("Enter amount to deposit: ");
        double d = sc.nextDouble();
        acc.deposit(d);

        System.out.print("Enter amount to withdraw: ");
        double w = sc.nextDouble();
        acc.withdraw(w);

        // Display final details
        acc.display();

        sc.close();
    }
}

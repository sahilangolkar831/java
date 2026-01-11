Write a Java program to simulate ATM PIN validation using exception handling.
The program should accept an ATM PIN from the user and compare it with a predefined valid PIN.
 If the entered PIN is incorrect, the program must throw a user-defined exception and 
handle it using appropriate try–catch blocks. 
The program should display a success message for a valid PIN and an error message for an invalid PIN, 
and finally print a message indicating the completion of the ATM transaction.

import java.util.Scanner;

// User-defined Exception
class InvalidPinException extends Exception {
    InvalidPinException(String msg) {
        super(msg);
    }
}

public class ATMPinExceptionDemo {

    static void validatePin(int pin) throws InvalidPinException {
        int correctPin = 1234;

        if (pin != correctPin) {
            throw new InvalidPinException("Invalid ATM PIN");
        }
        System.out.println("PIN verified successfully");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter ATM PIN: ");
            int pin = sc.nextInt();
            validatePin(pin);
        }
        catch (InvalidPinException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }
        finally {
            System.out.println("Thank you for using ATM service");
        }

        sc.close();
    }
}

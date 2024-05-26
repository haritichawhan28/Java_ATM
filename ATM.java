import java.util.Scanner;

public class SimpleATM {

    // Simulating a user's bank account balance
    private static double balance = 1000.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to Simple ATM");

        // Main ATM loop
        while (!exit) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using Simple ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        scanner.close();
    }

    // Method to check the balance
    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    // Method to deposit money
    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.printf("Successfully deposited $%.2f%n", depositAmount);
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }

    // Method to withdraw money
    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.printf("Successfully withdrew $%.2f%n", withdrawAmount);
            checkBalance();
        } else {
            System.out.println("Invalid withdrawal amount. Please try again.");
        }
    }
}

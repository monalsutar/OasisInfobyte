import java.util.Scanner;

// Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return false;
        }
    }
}

// ATM Class
public class ATM {
    private BankAccount userAccount;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.userAccount = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayOptions() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void performOperation() {
        int choice;
        do {
            displayOptions();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void checkBalance() {
        System.out.println("Current Balance: $" + userAccount.getBalance());
    }

    private void deposit() {
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        userAccount.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        userAccount.withdraw(amount);
    }

    public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        BankAccount userAccount = new BankAccount(1000);

        // Create an ATM for the user account
        ATM atm = new ATM(userAccount);

        // Perform ATM operations
        atm.performOperation();
    }
}

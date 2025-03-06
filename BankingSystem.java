import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Withdrawal method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Account creation
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter your account number:");
        String accountNumber = scanner.nextLine();
        
        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();
        
        BankAccount account = new BankAccount(name, accountNumber, initialBalance);
        
        // Perform deposit and withdrawal
        System.out.println("Enter deposit amount:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        
        System.out.println("Enter withdrawal amount:");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);
        
        scanner.close();
    }
}

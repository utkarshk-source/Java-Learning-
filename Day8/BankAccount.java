/*
Build a BankAccount class with:
- Account holder name
- Account number
- Balance
- deposit() method
- withdraw() method
- displayBalance() method
Try to prevent withdrawals that exceed the balance.
*/


package Day8;
import java.util.*;
public class BankAccount {
	
	 // Instance variables
    String accountHolderName;
    long accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        }
    }

    // Display balance method
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder name:");
        String name = sc.nextLine();
        
        System.out.print("Account number : ");
        long accountNumber = sc.nextLong();
        
        System.out.print("Account Blacne :");
        double balance = sc.nextDouble();
        
        System.out.print("Enter Deposite Account : ");
        double depositAmount = sc.nextDouble();
        
        System.out.print("Enter Withdrawal Ammount : ");
        double withdrawAmount = sc.nextDouble();
        System.out.println();

        // Create object
        BankAccount account =
            new BankAccount(name, accountNumber, balance);

        // Call methods
        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);
        account.displayBalance();

        sc.close();
    }

}

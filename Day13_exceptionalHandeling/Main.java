package Day13_exceptionalHandeling;


class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}



class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                "Withdrawal failed. Available balance: ₹" + balance +
                ", requested amount: ₹" + amount
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: ₹" + balance);
    }
}


public class Main {

	public static void main(String[] args) {
		 BankAccount account = new BankAccount(5000);

	        try {

	            account.withdraw(7000);

	        } catch (InsufficientBalanceException e) {

	            System.out.println(e.getMessage());

	        }

	}

}

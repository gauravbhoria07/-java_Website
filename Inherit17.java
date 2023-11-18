// BankAccount.java
public abstract class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

// SavingsAccount.java
public class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100.0) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance should be maintained.");
        }
    }
}

// CurrentAccount.java
public class CurrentAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        // Implement withdrawal logic for current account
        super.withdraw(amount);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(200.0);
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.withdraw(50.0);
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.withdraw(100.0);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(500.0);
        currentAccount.withdraw(200.0);
        System.out.println("Balance: " + currentAccount.getBalance());
    }
}

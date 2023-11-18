// Bank.java
import java.util.ArrayList;
import java.util.List;

 class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Methods to deposit, withdraw, and other banking operations could be added here
}

// Account.java
public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and setter methods for accountNumber and balance could be added here
}

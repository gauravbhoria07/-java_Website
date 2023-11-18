class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

class Depositor implements Runnable {
    private BankAccount account;

    public Depositor(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(100);
        }
    }
}

class Withdrawer implements Runnable {
    private BankAccount account;

    public Withdrawer(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.withdraw(50);
        }
    }
}

 class ConcurrentBankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositorThread = new Thread(new Depositor(account));
        Thread withdrawerThread = new Thread(new Withdrawer(account));

        depositorThread.start();
        withdrawerThread.start();
    }
}

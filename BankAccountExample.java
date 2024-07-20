class BankAccount
{
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    // Synchronized method to deposit money
    public synchronized void deposit(double amount) 
    {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(double amount) 
    {
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
        } 
        else 
        {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + ". Insufficient funds.");
        }
    }
}

public class BankAccountExample
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(500);

        // Thread for depositing money
        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
                try { Thread.sleep(100); } catch (InterruptedException e) { }
            }
        }, "DepositThread");

        // Thread for withdrawing money
        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(50);
                try { Thread.sleep(150); } catch (InterruptedException e) { }
            }
        }, "WithdrawThread");

        depositThread.start();
        withdrawThread.start();
    }
}


OUTPUT:-
DepositThread deposited 100.0. New balance: 600.0
WithdrawThread withdrew 50.0. New balance: 550.0
DepositThread deposited 100.0. New balance: 650.0
WithdrawThread withdrew 50.0. New balance: 600.0
DepositThread deposited 100.0. New balance: 700.0
WithdrawThread withdrew 50.0. New balance: 650.0
DepositThread deposited 100.0. New balance: 750.0
DepositThread deposited 100.0. New balance: 850.0
WithdrawThread withdrew 50.0. New balance: 800.0
WithdrawThread withdrew 50.0. New balance: 750.0
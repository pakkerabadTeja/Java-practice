package bank;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private void displayAccountNumber() {
        System.out.println("Account Number: " + accountNumber);
    }

    private void displayBalance() {
        System.out.println("Balance: " + balance);
    }

   
    public void displayAccountDetails() {
        displayAccountNumber();
        displayBalance();
    }
}
package atm;

import bank.Account;

public class ATM2{
    public static void main(String[] args) {
        Account account = new Account("987654321", 500.00);

       
        account.displayAccountDetails(); 
	}
}
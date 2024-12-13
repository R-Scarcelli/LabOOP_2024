package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {

    static double ATM_TRANSACTION_FEE = 1;
    static int MANAGEMENT_FEE = 5;
    static double TRANSACTION_FEE = 0.01;

    private final int id;
    private double balance;
    private int transactions;

    public StrictBankAccount(final int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.transactions = 0;
    }

    @Override
    public void withdraw(int id, double amount) {
        if (checkId(id) && checkBalance(amount)) {
            this.balance -= amount;
            incrementTransactions();
        }
    }

    @Override
    public void deposit(int id, double amount) {
        if (checkId(id)) {
            this.balance += amount;
            incrementTransactions();
        }
    }

    @Override
    public void depositFromATM(int id, double amount) {
        if (checkId(id)) {
            this.balance += (amount - ATM_TRANSACTION_FEE);
            incrementTransactions();
        }
    }

    @Override
    public void withdrawFromATM(int id, double amount) {
        if (checkId(id) && checkBalance(amount)) {
            this.balance -= (amount + ATM_TRANSACTION_FEE);
            incrementTransactions();
        }
    }

    @Override
    public void chargeManagementFees(int id) {
        this.balance -= (5 + this.getTransactionsCount() * TRANSACTION_FEE);
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public int getTransactionsCount() {
        return this.transactions;
    }

    private int incrementTransactions() {
        return this.transactions++;
    }

    private boolean checkBalance(double amount) {
        return this.balance >= amount;
    }

    private boolean checkId(int id) {
        return this.id == id;
    }

    @Override
    public String toString() {
        return "StrictBankAccount [id=" + id + ", balance=" + balance + ", transactions=" + transactions + "]";
    }
}

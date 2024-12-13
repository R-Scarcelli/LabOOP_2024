package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {

    public static final double ATM_TRANSACTION_FEE = 1;
    public static final double MANAGEMENT_FEE = 5;
    private final AccountHolder holder;
    private double balance;
    private int transactions;

    protected AbstractBankAccount(final AccountHolder holder, final double balance) {
        this.holder = holder;
        this.balance = balance;
        this.transactions = 0;
    }

    public AccountHolder getAccountHolder() {
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    protected final void setBalance(final double amount) {
        this.balance = amount;
    }

    public void chargeManagementFees(final int id) {
        if (checkUser(id) && isWithdrawAllowed(computeFee())) {
            balance -= computeFee();
            resetTransactions();
        }
    }

    public void deposit(final int id, final double amount) {
        this.transactionOp(id, amount);
    }

    public void depositFromATM(final int id, final double amount) {
        this.deposit(id, amount);
    }

    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

    protected abstract boolean isWithdrawAllowed(double amount);

    protected abstract double computeFee();

    protected boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    protected void incrementTransactions() {
        this.transactions++;
    }

    protected void resetTransactions() {
        this.transactions = 0;
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

}

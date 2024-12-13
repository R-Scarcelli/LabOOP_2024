package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class RestrictedBankAccount extends AbstractBankAccount {

    private static final double TRANSACTION_FEE = 0.1;

    public RestrictedBankAccount(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }

    @Override
    protected boolean isWithdrawAllowed(double amount) {
        return getBalance() >= amount;
    }

    @Override
    protected double computeFee() {
        return MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
    }
}

package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {

    public ClassicBankAccount(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }

    @Override
    protected boolean isWithdrawAllowed(double amount) {
        return true;
    }

    @Override
    protected double computeFee() {
        return MANAGEMENT_FEE;
    }

}
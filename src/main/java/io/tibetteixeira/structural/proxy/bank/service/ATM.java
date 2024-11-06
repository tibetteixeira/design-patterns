package io.tibetteixeira.structural.proxy.bank.service;

public class ATM implements BankOperation {
    private BankOperation bank;

    public ATM(BankOperation bank) {
        this.bank = bank;
    }

    @Override
    public void deposit(Long account, Double amount) {
        System.out.println("ATM proxy sending request to bank");
        bank.deposit(account, amount);
    }

    @Override
    public void withdraw(Long account, String password, Double amount) {
        if (amount > 500.0) {
            System.out.println("You may not withdraw amounts over 500.00 here");
            return;
        }

        System.out.println("ATM proxy sending request to bank");
        bank.withdraw(account, password, amount);
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        System.out.println("You must go to the bank to perform this operation");
    }
}

package io.tibetteixeira.structural.proxy.bank.service;

public interface BankOperation {
    void deposit(Long account, Double amount);
    void withdraw(Long account, String password, Double amount);
    void changePassword(Long account, String oldPassword, String newPassword);
}

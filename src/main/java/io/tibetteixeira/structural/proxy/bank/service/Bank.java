package io.tibetteixeira.structural.proxy.bank.service;

import io.tibetteixeira.structural.proxy.bank.model.User;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;
import static java.util.Objects.isNull;
import static org.apache.commons.lang3.BooleanUtils.isFalse;

public class Bank implements BankOperation {
    private Map<Long, User> userDatabase;

    public Bank() {
        this.userDatabase = new HashMap<>();
        userDatabase.put(123L, new User("User 1", "1234", 123L, 1000.0));
        userDatabase.put(456L, new User("User 2", "4567", 456L, 2000.0));
    }

    @Override
    public void deposit(Long account, Double amount) {
        User user = userDatabase.get(account);

        if (isNull(user)) {
            System.out.println("Invalid account!");
            return;
        }

        user.setBalance(user.getBalance() + amount);
        System.out.println(format("%s +%.2f. New balance: %.2f", user.getName(), amount, user.getBalance()));
    }

    @Override
    public void withdraw(Long account, String password, Double amount) {
        User user = userDatabase.get(account);

        if (isNull(user)) {
            System.out.println("Invalid account!");
            return;
        }

        if (isFalse(user.getPassword().equals(password))) {
            System.out.println("Wrong password!");
            return;
        }

        if (user.getBalance() < amount) {
            System.out.println("You don't have enough resources");
            return;
        }

        user.setBalance(user.getBalance() - amount);
        System.out.println(format("%s -%.2f. New balance: %.2f", user.getName(), amount, user.getBalance()));
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        User user = userDatabase.get(account);

        if (isNull(user)) {
            System.out.println("Invalid account!");
            return;
        }

        if (isFalse(user.getPassword().equals(oldPassword))) {
            System.out.println("Wrong password!");
            return;
        }

        user.setPassword(newPassword);
        System.out.println(format("%s's password updated succesfuly", user.getName()));

    }
}

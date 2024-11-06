package io.tibetteixeira.structural.proxy.bank;

import io.tibetteixeira.structural.proxy.bank.service.ATM;
import io.tibetteixeira.structural.proxy.bank.service.Bank;
import io.tibetteixeira.structural.proxy.bank.service.BankOperation;

public class App {

    public static void main(String[] args) {
        bankOperations();
        atmOperations();
    }

    private static void bankOperations() {
        System.out.println("-------| BANK |-------");
        BankOperation bank = new Bank();
        bank.deposit(123L, 500.0);
        bank.withdraw(123L, "8888", 50.0);
        bank.withdraw(123L, "1234", 50.0);
        bank.withdraw(123L, "1234", 5000.0);
        bank.changePassword(123L, "8888", "9999");
        bank.changePassword(123L, "1234", "9999");
    }

    private static void atmOperations() {
        System.out.println("-------| ATM |-------");
        BankOperation atm = new ATM(new Bank());
        atm.deposit(456L, 500.0);
        atm.withdraw(456L, "8888", 50.0);
        atm.withdraw(456L, "1234", 50.0);
        atm.withdraw(456L, "1234", 5000.0);
        atm.changePassword(456L, "8888", "9999");
        atm.changePassword(456L, "1234", "9999");
    }
}

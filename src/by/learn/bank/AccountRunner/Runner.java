package by.learn.bank.AccountRunner;

import by.learn.bank.Account.Account;
import by.learn.bank.Account.Transactions;

public class Runner {
    public static void main(String[] args) {
        Account account = new Account(10);
        System.out.println(account); // balance = 10

        account.newTransaction(5, Transactions.type.WITHDRAW);
        System.out.println(account); // balance = 5

        account.newTransaction(5, Transactions.type.PAYMENT);
        System.out.println(account); // balance = 0

        account.newTransaction(10, Transactions.type.RECEIPT);
        System.out.println(account); // balance = 10

        System.out.println(account.getHistory());
    }
}

package by.learn.bank.Account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private int amountOfOperations;
    private double balance;
    List<Transaction> history;

    public Account(double balance) {
        this.balance = balance;
        this.history = new ArrayList<>();
    }

    public class Transaction {
        private int id;
        private Transactions.type type;
        private double amount;
        private Date date;

        public Transaction(double amount, Transactions.type type) {
            this.id = Account.this.amountOfOperations;
            this.type = type;
            this.amount = amount;
            this.date = new Date();
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append('\n');
            sb.append(id).append(". ");
            sb.append("type: ").append(type);
            sb.append("\n   amount: ").append(amount);
            sb.append("\n   date: ").append(date);
            return sb.toString();
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addOperation() {
        this.amountOfOperations++;
    }

    public void newTransaction(double amount, Transactions.type type) {
        this.addOperation();
        Transaction transaction = new Transaction(amount,type);
        transaction.type.execute(this, amount);
        this.history.add(transaction);
    }

    public List<Transaction> getHistory() {
        return history;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account[");
        sb.append("balance=").append(balance);
        sb.append(']');
        return sb.toString();
    }
}
package by.learn.bank.Account;

public class Transactions {
    public enum type {
        WITHDRAW, PAYMENT, RECEIPT {
            public void execute(Account object, double amount) {
                object.setBalance(object.getBalance() + amount);
            }
        };
        public void execute(Account object, double amount) {
            object.setBalance(object.getBalance() - amount);
        }
    }
}

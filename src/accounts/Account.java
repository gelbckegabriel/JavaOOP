package accounts;

import default_.Client;

public abstract class Account implements IAccount { // An abstract class can´t be instantiated.

    protected int agency;
    protected int accountNumber;
    protected double balance;
    protected Client client;

    private static int defaultAgency = 1;
    private static int sequentialNumber = 1; // This will keep the number growing.

    public Account(Client client) { // When we create a new checking account.
        this.agency = Account.defaultAgency++;
        this.accountNumber = sequentialNumber++;
        this.client = client;
    }

    public int getAgency() {
        return agency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double value) {
        this.balance = balance - value;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    protected void printCommonInfo() {
        System.out.println(String.format("Client: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Account Number: %d", this.accountNumber));
        System.out.println(String.format("Total Value: R$%.2f", this.balance));
    }
}

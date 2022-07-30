package accounts;

import accounts.Account;

public interface IAccount {

    void withdraw(double value);

    public void deposit(double value);

    public void transfer(double value, Account destinationAccount);

    public void printBankStatement();

}
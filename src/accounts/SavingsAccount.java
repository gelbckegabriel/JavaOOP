package accounts;

import accounts.Account;
import default_.Client;

public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== Savings Account Balance ===");
        printCommonInfo();
    }

}

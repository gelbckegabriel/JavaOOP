package accounts;

import default_.Client;

public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== Checking Account Balance ===");
        printCommonInfo();
    }


}

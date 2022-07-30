package default_;

import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;
import java.util.*;

public class RunApplication {

    public static void main (String[] args) {

        // Creating a client.
        Client gelbcke = new Client();
        gelbcke.setName("Gelbcke");

        // Creating an account.
        Account regularAccount = new CheckingAccount(gelbcke);
        Account savings = new SavingsAccount(gelbcke);

        System.out.println("GG´s Bank \n");

        regularAccount.deposit(794.86);
        regularAccount.transfer(300, savings);
        savings.withdraw(68.96);

        regularAccount.printBankStatement();
        System.out.println("\n --------------------------------- \n");
        savings.printBankStatement();

    }

}

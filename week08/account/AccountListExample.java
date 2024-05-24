package account;

import java.util.*;

public class AccountListExample {
    public static void main(String[] args) {

        
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Javid", "Jabiyev", 100.00));
        accounts.add(new Account("Ayal", "Gasimli", 200.00));
        accounts.add(new Account("Ayal", "Yusibli", 1100.00));

        System.out.println("List of Account: ");
        for (Account i : accounts) {
            System.out.println(i);
        }

        Collections.sort(accounts);
        System.out.println("\nSorted by Fullname: ");
        for (Account i : accounts) {
            System.out.println(i);
        }

        accounts.sort(Account.getBalanceComparator());
        

        System.out.println("\nSorted by Balance: ");
        for (Account i : accounts) {
            System.out.println(i);
        }

    }
}
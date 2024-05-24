package week10.specific;

import account.Account;

public class AccountChecker implements PropertyChecker<Account> {
    public boolean checkProperty(Account account) {
        return account.getBalance() == 0;
    }
}

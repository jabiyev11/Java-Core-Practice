package week10.specific;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import account.Account;

public class SpecificElementCount {

    public static <T> int countElementWithProperty(Collection<T> collection, PropertyChecker<T> propertyChecker) {
        int count = 0;
        for (T elements : collection) {
            if (propertyChecker.checkProperty(elements)) {
                count++;
            }
        }
        return count;
    }

    public static void testEvenIntegers() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(21);
        numbers.add(345);
        numbers.add(42);
        numbers.add(56);

        int evenCount = countElementWithProperty(numbers, new EvenIntegerChecker());

        System.out.println("Number of even integers: " + evenCount);

    }

    public static void testPalindromeStrings() {
        List<String> strings = new ArrayList<>();

        strings.add("kalak");
        strings.add("Jabah");
        strings.add("salas");
        strings.add("ollak");
        strings.add("Lokak");
        strings.add("Mokak");
        strings.add("palap");

        int palindromeCount = countElementWithProperty(strings, new PalindromeStringChecker());

        System.out.println("Palindrome count: " + palindromeCount);
    }

    public static void testEmptyAccounts() {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account("Javid", "Jabiyev", 100.0));
        accounts.add(new Account("Murad", "Yusibli", 0.0));
        accounts.add(new Account("Ayal", "Gasimli", 1000.0));
        accounts.add(new Account("Polad", "Hatamov", 0.0));
        accounts.add(new Account("Ismayil", "Maharramov", 0.0));

        int emptyCount = countElementWithProperty(accounts, new AccountChecker());

        System.out.println("Count of empty accounts: " + emptyCount);

    }

    public static void main(String[] args) {
        testEvenIntegers();
        testPalindromeStrings();
        testEmptyAccounts();

    }
}

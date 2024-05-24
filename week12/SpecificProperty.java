package week12;

import week10.specific.PropertyChecker;
import week11.readingCsv.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import geometry.Point;

public class SpecificProperty {
    public static void main(String[] args) {

        // Test 1
        PropertyChecker<Integer> isOdd = x -> x % 2 != 0;

        System.out.println("Is 5 Odd? " + isOdd.checkProperty(5));
        System.out.println("Is 6 Odd? " + isOdd.checkProperty(6));

        // Test2
        PropertyChecker<Point> isInTheFirstQuadrant = (point) -> point.getX() > 0 && point.getY() > 0;

        Point p1 = new Point(3, 2);
        Point p2 = new Point(-1, 5);

        System.out.println("Is p1 in the first quadrant? " + isInTheFirstQuadrant.checkProperty(p1));
        System.out.println("Is p2 in the first quadrant? " + isInTheFirstQuadrant.checkProperty(p2));

        // Test3
        PropertyChecker<String> isPanagram = word -> {
            word = word.toLowerCase();
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    uniqueChars.add(c);
                }
            }
            return uniqueChars.size() == 26;
        };

        System.out.println("Is 'The quick brown fox jumps over the lazy dog' a pangram? "
                + isPanagram.checkProperty("The quick brown fox jumps over the lazy dog"));
        System.out.println("Is 'Hello World' a pangram? " + isPanagram.checkProperty("Hello World"));

        // Test4
        PropertyChecker<Person> isOlderThan20 = person -> person.getAge() > 20;

        Person person1 = new Person(0001, "Javid", "Jabiyev", 18);
        Person person2 = new Person(0002, "Polad", "Hatamov", 23);

        System.out.println("Is Javid older than 20? " + isOlderThan20.checkProperty(person1));
        System.out.println("Is Polad older than 20 years old? " + isOlderThan20.checkProperty(person2));

        // Testing filter method in section b
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(83);
        numbers.add(19);

        List<Integer> oddNumbers = filter(numbers, isOdd);

        System.out.println("Odd numbers: " + oddNumbers);


    }

    public static <T> List<T> filter(Collection<T> c, PropertyChecker<T> p) {
        List<T> result = new ArrayList<>();
        for (T element : c) {
            if (p.checkProperty(element)) {
                result.add(element);
            }
        }
        return result;
    }
}

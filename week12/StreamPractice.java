package week12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {

        // i
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean noneEven = numbers.stream().noneMatch(n -> n % 2 == 0);

        System.out.println("All Even: " + allEven);
        System.out.println("Any Even: " + anyEven);
        System.out.println("None Even: " + noneEven);

        // ii
        List<String> words = Arrays.asList("Lawyer", "Engineer", "Doctor", "Teacher");

        long wordCount = words.stream().count();
        System.out.println("Word count is " + wordCount);

        // iii

        Stream<Double> randomStream = Stream.generate(Math::random).limit(7);

        randomStream.forEach(System.out::println);

        // iv

        List<String> customers = Arrays.asList("Javid", "Nicat", "Elgun", "Ayal");

        customers.stream().forEach(name -> System.out.println("Hello " + name));

        // v
        List<String> names = Arrays.asList("Javid", "Nicat", "Elgun", "Ayal");

        Optional<String> first = names.stream().findFirst();
        Optional<String> any = names.parallelStream().findAny();

        first.ifPresentOrElse(
                name -> System.out.println("First Name: " + name),
                () -> System.out.println("No first name found")

        );

        any.ifPresentOrElse(
                name -> System.out.println("Any Name: " + name),
                () -> System.out.println("No name found in parallel stream")

        );

        // vi

        List<String> gamers = Arrays.asList("Javid", "Mahammad", "Ismayil", "Ayal");

        //Filterig 
        List<String> filteredGamers = gamers.stream()
            .filter(gamer -> gamer.length() > 5)
            .collect(Collectors.toList());

        System.out.println("Filtered array " + filteredGamers);

        //Maping and Collecting
        List<Integer> gamerLength = gamers.stream()
            .map(String::length)
            .collect(Collectors.toList());

            System.out.println("Gamer Length " + gamerLength);

        //Sorting

        List<String> sortedGamers = gamers.stream()
            .sorted()
            .collect(Collectors.toList());

            System.out.println("Sorted Gamers " + sortedGamers);


        //vii

        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8, 10);

        int sum = evenNumbers.stream()
            .reduce(0, Integer::sum);

            System.out.println("Sum of numbers is " + sum);

        Optional<Integer> max = evenNumbers.stream().
            reduce(Integer::max);

            max.ifPresent(m -> System.out.println("Maximum number is " + m));
    }
}
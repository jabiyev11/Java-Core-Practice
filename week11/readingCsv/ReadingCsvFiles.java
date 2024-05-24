package week11.readingCsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingCsvFiles {

    public static List<Person> readCsvFile(String filename) throws IOException {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // This will ensure that heading is not included in the loop
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String firstName = data[1];
                String lastName = data[2];
                int age = Integer.parseInt(data[3]);
                persons.add(new Person(id, firstName, lastName, age));
            }
        }
        return persons;
    }

    public static void writeCsvFile(String filename, List<Person> persons) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("id,firstName,lastName,age\n");
            for (Person person : persons) {
                bw.write(String.format("%d,%s,%s,%d\n", person.getId(), person.getFirstName(), person.getLastName(),
                        person.getAge()));
            }
        }
    }

    public static double averageAge(List<Person> persons) {
        double totalAge = 0.0;
        for (Person person : persons) {
            totalAge += person.getAge();
        }

        return (double) totalAge / persons.size();
    }

    public static void main(String[] args) {
        
        try{
            List<Person> persons = readCsvFile("persons.csv");
            double avgAge = averageAge(persons);
            System.out.println("Average age: " + avgAge);


            List<Person> underAverage = new ArrayList<>();
            List<Person> aboveAverage = new ArrayList<>();

            for(Person person : persons){
                if(person.getAge() < avgAge){
                    underAverage.add(person);
                }

                else if(person.getAge() > avgAge){
                    aboveAverage.add(person);
                }
            }

            writeCsvFile("under_average.csv", underAverage);
            writeCsvFile("above_average.csv", aboveAverage);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
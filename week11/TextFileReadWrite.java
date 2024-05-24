package week11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileReadWrite {

    public static void main(String[] args) {
        writeToFile("example.txt", "Javid Jabiyev");

        String content1 = readFileUsingRead("example.txt");
        String content2 = readFileUsingReadCharArray("example.txt");

        System.out.println("Reading content using read: " + content1);
        System.out.println("Reading content using read(char[]): " +content2);
    }

    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Successfuly wrote to a file");
        } catch (IOException e) {
            System.out.println("An error occured while writing to a file.");
            e.printStackTrace();
        }
    }

    public static String readFileUsingRead(String filename) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(filename);
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error happened during the file reading");
            e.printStackTrace();
        }
        return content.toString();

    }

    public static String readFileUsingReadCharArray(String filename) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(filename);
            char[] buffer = new char[1024];
            int length;
            while ((length = reader.read(buffer)) != -1) {
                content.append(buffer, 0, length);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error occured while reading a file");
            e.printStackTrace();
        }

        return content.toString();
    }
}

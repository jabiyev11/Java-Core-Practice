package week11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String data = "This is a sample data to write to a file";

        //a
        
        try (FileOutputStream outputStream = new FileOutputStream("output.txt")) {
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            System.out.println("Data has been written to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // b
        System.out.println("Check the content of the file: ");
        try (FileInputStream inputStream = new FileInputStream("output.txt")) {
            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.println((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // c using read() method
        System.out.println("Reading file using read() method: ");
        try (FileInputStream inputStream = new FileInputStream("output.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            int character;
            while ((character = inputStream.read()) != -1) {
                stringBuilder.append((char) character);
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // c using read(byte[]) method

        System.out.println("Read file using read(byte[]) method: ");
        try (FileInputStream inputStream = new FileInputStream("output.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                stringBuilder.append(new String(buffer, 0, bytesRead));
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Differences explained in readme file

    }
}

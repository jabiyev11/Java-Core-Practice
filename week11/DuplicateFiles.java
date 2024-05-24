package week11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFiles {

    public static void main(String[] args) throws IOException {
        String originalFilePath = "original.txt";
        String duplicateFilePath = "duplicate.txt";

        duplicateFileByteByByte(originalFilePath, duplicateFilePath);

        if (isFileContentIdentical(originalFilePath, duplicateFilePath)) {
            System.out.println("The files are identical");
        } else {
            System.out.println("The files are different");
        }
    }

    static void duplicateFileByteByByte(String originalFilePath, String duplicateFilePath) {
        try (FileInputStream inputStream = new FileInputStream(originalFilePath);
                FileOutputStream outputStream = new FileOutputStream(duplicateFilePath)) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean isFileContentIdentical(String originalFilePath, String duplicateFilePath) {
        try (FileInputStream originalStream = new FileInputStream(originalFilePath);
                FileInputStream duplicateStream = new FileInputStream(duplicateFilePath)) {
            int originalByte, duplicateByte;
            while ((originalByte = originalStream.read()) != -1) {
                duplicateByte = duplicateStream.read();
                if (originalByte != duplicateByte) {
                    return false;
                }
            }
            
            return duplicateStream.read() == -1;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }
}

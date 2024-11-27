package sanity.nil.patterns.proxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        Path filePath1 = Paths.get("example.txt");
        Path filePath2 = Paths.get("example2.txt");

        Files.writeString(filePath1, "This is the content of example.txt");
        Files.writeString(filePath2, "This is the content of example2.txt");

        File file1 = new FileProxy("example.txt");
        File file2 = new FileProxy("example2.txt");

        System.out.println("Accessing metadata for file1...");
        System.out.println("File name: " + file1.getName());
        System.out.println("File size: " + file1.getSize() + " bytes");

        System.out.println("\nAccessing content for file1...");
        System.out.println("Content: " + file1.getContent());

        System.out.println("\nAccessing metadata for file2...");
        System.out.println("File name: " + file2.getName());
        System.out.println("File size: " + file2.getSize() + " bytes");

        System.out.println("\nAccessing content for file2...");
        System.out.println("Content: " + file2.getContent());
    }
}

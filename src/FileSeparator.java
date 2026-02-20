import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSeparator {
    public static void main(String[] args) {
        // Step 1: Read from numbers.txt and separate into even.txt and odd.txt
        // Hint: Use Scanner to read from the file and PrintWriter to write to files.
        try {
            // TODO: Initialize Scanner for numbers.txt
            // TODO: Initialize PrintWriter for even.txt and odd.txt
            
            // TODO: Loop through the input file, check if numbers are even or odd, and write to respective files
            
            // TODO: Close all resources (Scanner and both PrintWriters) to save the files properly
            
        } catch (FileNotFoundException e) {
            System.out.println("Error processing files.");
        }

        // Step 2: Read and display even.txt
        System.out.print("Even File: ");
        // TODO: Read even.txt and print its contents on a single line
        System.out.println();

        // Step 3: Read and display odd.txt
        System.out.print("Odd File: ");
        // TODO: Read odd.txt and print its contents on a single line
        System.out.println();
    }
}

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

		 Scanner input = new Scanner(new File("numbers.txt"));
            PrintWriter evenWriter = new PrintWriter("even.txt");
            PrintWriter oddWriter = new PrintWriter("odd.txt");

            while (input.hasNextInt()) {
                int num = input.nextInt();
                if (num % 2 == 0) {
                    evenWriter.print(num + " ");
                } else {
                    oddWriter.print(num + " ");
                }
            }

            input.close();
            evenWriter.close();
            oddWriter.close();


	
            
        } catch (FileNotFoundException e) {
            System.out.println("Error processing files.");
        }

        // Step 2: Read and display even.txt
       
        // TODO: Read even.txt and print its contents on a single line
        

	System.out.print("Even File: ");
        try {
            Scanner evenReader = new Scanner(new File("even.txt"));
            while (evenReader.hasNextLine()) {
                System.out.print(evenReader.nextLine());
            }
            evenReader.close();
        } catch (FileNotFoundException e) {
        }
        System.out.println();

        // Step 3: Read and display odd.txt
        
        // TODO: Read odd.txt and print its contents on a single line
        
	
	System.out.print("Odd File: ");
        try {
            Scanner oddReader = new Scanner(new File("odd.txt"));
            while (oddReader.hasNextLine()) {
                System.out.print(oddReader.nextLine());
            }
            oddReader.close();
        } catch (FileNotFoundException e) {
        }
        System.out.println();

	
    }
}

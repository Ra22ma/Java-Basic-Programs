import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sort
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        // Split the input string into an array of strings
        String[] tokens = input.split("\\s+");
        
        // Convert the array of strings to a list of integers
        Integer[] numbersArray = new Integer[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbersArray[i] = Integer.parseInt(tokens[i]);
        }
        
        // Create a list from the array
        List<Integer> numbers = Arrays.asList(numbersArray);
        
        // Sort the list
        numbers.sort(null);
        
        // Print the sorted list
        System.out.println( numbers);
        
        // Close the scanner
        scanner.close();
    }
}
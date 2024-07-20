import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArray 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList of integers
        ArrayList<Integer> intList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter integers
        System.out.println("Enter 9 integers:");

        for (int i = 0; i < 9; i++) 
        {
            System.out.print("Enter integer " + (i + 1) + ": ");
            intList.add(scanner.nextInt());
        }

        // Sort the list
        Collections.sort(intList);

        // Print the sorted list
        System.out.println("Sorted Integer List: " + intList);

        scanner.close();
    }
}

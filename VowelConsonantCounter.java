package practice;
import java.util.Scanner;

public class VowelConsonantCounter 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert the input string to lowercase to make the check case insensitive
        input = input.toLowerCase();
        
        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;
  
        // Define a string of vowels for easy checking
        String vowels = "aeiou";
        
        // Iterate over each character in the string
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) 
            {
                // Check if the character is a vowel
                if (vowels.indexOf(ch) != -1) 
                {
                    vowelCount++;
                } 
                else 
                {
                    // If it's not a vowel, it's a consonant
                    consonantCount++;
                }
            }
        }
        
        // Output the counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        
        // Close the scanner
        scanner.close();
    }
}

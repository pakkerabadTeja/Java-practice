package practice;
public class ExceptionHandlingExample 
{
    public static void main(String[] args) 
    {
        // Array for demonstration purposes
        int[] numbers = {1, 2, 3, 4, 5};
        
        try 
        {
            // Attempt to access an index that is out of bounds
            System.out.println("Accessing element at index 10: " + numbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try
        {
            // Attempt to perform division by zero
            int result = numbers[1] / 0;
            System.out.println("Result of division: " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

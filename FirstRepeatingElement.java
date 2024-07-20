import java.util.HashMap;

public class FirstRepeatingElement 
{
    public static int findFirstRepeating(int[] arr)
    {
        HashMap<Integer, Integer> elementIndexMap = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) 
        {
            if (elementIndexMap.containsKey(arr[i])) 
            {
                return arr[i]; // The first repeating element
            } 
            else
            {
                elementIndexMap.put(arr[i], i);
            }
        }
        
        return -1; // Indicates no repeating element found
    }

    public static void main(String[] args) 
     {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int firstRepeating = findFirstRepeating(arr);
        
        if (firstRepeating != -1)
        {
            System.out.println("The first repeating element is: " + firstRepeating);
        } 
        else
        {
            System.out.println("No repeating elements found.");
        }
    }
}

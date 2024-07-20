import java.util.Scanner;

public class SumPositiveOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int sumOdd = 0;
        for (int num : array) {
            if (num > 0 && num % 2 != 0) { // Check if number is positive and odd
                sumOdd += num;
            }
        }
        System.out.println("Sum of positive odd numbers: " + sumOdd);

        scanner.close();
    }
}
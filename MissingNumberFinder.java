
public class MissingNumberFinder {

	public static void main(String[] args) {
		int[] array = {1, 2, 4, 6, 3, 7, 8};
		int n = array.length +1;
		int missingNumber = findMissingNumber(array, n);
		System.out.println("The missing number is: " + missingNumber);
		
	}
	public static int findMissingNumber(int[] array, int n) {
		int expectedSum = n* (n+1)/2;
		int actualSum = 0;
		for (int num: array) {
			actualSum +=num;
		}
		return expectedSum - actualSum;
		}

}

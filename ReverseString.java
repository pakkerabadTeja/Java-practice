
public class ReverseString {

	public static void main(String[] args) {
		String original = "Teja kiran";
		String reversed = reverseString (original);
		System.out.println("Original String:"+ original);
		System.out.println("reversed String:"+ reversed);
	}
	public static String reverseString(String input) {
		char[] chars = input.toCharArray();
		int left = 0;
		int right = chars.length - 1;
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		
		}
		return new String(chars);
		
	}

}

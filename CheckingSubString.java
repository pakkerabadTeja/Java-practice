public class CheckingSubString
{

	public static void main(String[] args) 
        {
		String str1 = "Java Programming";
		String str2 =  "Programming";
		
		boolean containssubStr = str1.contains(str2);
		if(containssubStr) 
                {
			System.out.println("The Main String "+str1+" contains sub String "+str2);
		}
		else 
                {
			System.out.println("The Main String "+str1+" does not contains sub String "+str2);
}
}
}
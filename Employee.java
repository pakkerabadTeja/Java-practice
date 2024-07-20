public class Employee {
	static int eId;
	static String eName;
	static String companyName;
	
	public static void displayDetails() {
		System.out.println("Employee id: "+eId);
		System.out.println("Employee name: "+eName);
		System.out.println("Company name: "+companyName);
	}

	public static void main(String[] args) {
		eId=100;
		eName="Tejakiran";
		companyName="TEJ company";
		displayDetails();
		

	}

}
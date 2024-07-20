public class TypeCasting {
    public static void main(String[] args) {
       
        int intValue = 10;
        double doubleValue = intValue;
        
        System.out.println("Implicit casting:");
        System.out.println("int value: " + intValue);
        System.out.println("double value after implicit casting: " + doubleValue);
        
       
        double anotherDoubleValue = 15.75;
        int anotherIntValue = (int) anotherDoubleValue;
        
        System.out.println("\nExplicit casting:");
        System.out.println("double value: " + anotherDoubleValue);
        System.out.println("int value after explicit casting: " + anotherIntValue);
    }
}

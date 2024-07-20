class Hillstations // Superclass
{
    public void location() {
       
     }

    public void famousfor() {
        // Default implementation
    }
}

class Manali extends Hillstations // Subclass Manali
{
    public void location() 
    {
        System.out.println("Manali is located in Himachal Pradesh");
    }
    public void famousfor() 
    {
        System.out.println("Manali is famous for its Valleys, Adventure sports, and snow-capped mountains");
    }
}

class Mussoorie extends Hillstations // Subclass Mussoorie

{
    public void location() 
    {
        System.out.println("Mussoorie is located in Uttarakhand");
    }

    public void famousfor() 
    {
        System.out.println("Mussoorie is famous for its scenic beauty, pleasant weather, and the Mall Road");
    }
}

class Gulmarg extends Hillstations // Subclass Gulmarg
{
    public void location() 
    {
        System.out.println("Gulmarg is located in Jammu and Kashmir");
    }
    public void famousfor() 
    {
        System.out.println("Gulmarg is famous for its ski resorts, the Gulmarg Gondola, and beautiful landscapes");
    }
}

// Main class to test the polymorphism
public class Hillstation 
{
    public static void main(String[] args) 
    {
        // Creating an array of Hillstations references
        Hillstations[] hillstations = {new Manali(), new Mussoorie(), new Gulmarg()};

        // Loop through each Hillstations object and call the overridden methods
        for (Hillstations station : hillstations) 
         {
            station.location();
            station.famousfor();
            System.out.println();
}
}
}
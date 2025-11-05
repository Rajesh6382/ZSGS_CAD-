class Bike 
{
    void run() 
    {
        System.out.println("Bike is running");
    }
}

class SportsBike extends Bike 
{
    void run() 
    {
        System.out.println("SportsBike is running fast!");
    }
}

class ElectricBike extends Bike 
{
    void run() 
    {
        System.out.println("ElectricBike is running silently!");
    }
}

public class Polymorphism 
{
    public static void main(String[] args) 
    {
        Bike b1 = new SportsBike();
        Bike b2 = new ElectricBike();

        b1.run();
        b2.run();
    }
}

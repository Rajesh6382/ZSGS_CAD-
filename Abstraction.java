abstract class Bike 
{
    abstract void run(String model);

    void showBrand() 
    {
        System.out.println("Brand: Yamaha");
    }
}

class SportsBike extends Bike 
{
    void run(String model) 
    {
        System.out.println(model + " is running fast!");
    }
}

public class Abstraction 
{
    public static void main(String[] args) 
    {
        Bike bike = new SportsBike();
        bike.showBrand();
        bike.run("R15");
    }
}

class Bike 
{
    String brand;

    void setBrand(String brand) 
    {
        this.brand = brand;
    }

    void displayBrand() 
    {
        System.out.println("Brand: " + brand);
    }
}

class SportsBike extends Bike 
{
    String model;

    void setModel(String model) 
    {
        this.model = model;
    }

    void showDetails() 
    {
        System.out.println(brand + " " + model + " is a powerful sports bike.");
    }
}

public class InheritanceDemo
{
    public static void main(String[] args) 
    {
        SportsBike bike = new SportsBike();
        bike.setBrand("Yamaha");
        bike.setModel("R15");
        bike.showDetails();
    }
}


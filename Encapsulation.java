class Bike 
{
    private String model;
    private int speed;
    private String color;

    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }

    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }

    public int getSpeed() 
    {
        return speed;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getColor() 
    {
        return color;
    }
}

public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Bike b = new Bike();
        b.setModel("Yamaha R15");
        b.setSpeed(140);
        b.setColor("Blue");

        System.out.println("Bike Model: " + b.getModel());
        System.out.println("Bike Speed: " + b.getSpeed() + " km/h");
        System.out.println("Bike Color: " + b.getColor());
    }
}


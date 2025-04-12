public class Automobile 
{
    private String make;
    private String model;
    private int year;
    private int numWheels;

    public Automobile(String make, String model, int year, int numWheels)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numWheels = numWheels;

    }

    public void getinfo()
    {
        System.out.println("The programmer is: Melanie Guevara");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Wheels: " + numWheels);
    }
}
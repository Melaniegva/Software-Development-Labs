

public class SUV extends Automobile 
{
	private int numpass;
	private double cargospc;
	
	public SUV(String make, String model, int year, int numWheels, int numpass, double cargospc) 
	{
		super(make, model, year, numWheels);
		this.numpass = numpass;
		this.cargospc = cargospc;
	}
	@Override
	public void getinfo() 
	{
		super.getinfo();
		System.out.println("Passangers: "+ numpass);
		System.out.println("Cargo space: " + cargospc);
	}
}

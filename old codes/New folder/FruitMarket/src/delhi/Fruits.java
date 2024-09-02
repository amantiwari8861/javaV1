package delhi;

public class Fruits {
	private int price;
	private String name;
	private double energy;
	Fruits(){}
	public Fruits(int price,String name,double energy) 
	{
		this.price=price;
		this.energy=energy;
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEnergy() {
		return energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
}

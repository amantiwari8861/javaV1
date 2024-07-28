package in.iamandroid.creational.abstractfactory;

public class ChocolateIceCream implements IceCream {

	String brand;
	Integer cost;
	Integer calories;
	
	public ChocolateIceCream(String brand, Integer cost, Integer calories) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.calories = calories;
	}

	@Override
	public Integer getCalories() {
		return calories;
	}

	@Override
	public Integer getCost() {
		return cost;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "ChocolateIceCream [brand=" + brand + ", cost=" + cost + ", calories=" + calories + "]";
	}
}
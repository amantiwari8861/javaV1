package in.iamandroid.creational.abstractfactory;

public class StrawberryIceCream implements IceCream {

	String brand;
	Integer cost;
	Integer calories;

	public StrawberryIceCream(String brand, Integer cost, Integer calories) {
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
		return "StrawberryIceCream [brand=" + brand + ", cost=" + cost + ", calories=" + calories + "]";
	}
	
}

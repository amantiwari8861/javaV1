package in.iamandroid.creational.factory;

public class Factory 
{
	public static Food getFood(String foodName) {
		Food food = null;
		if (foodName.equalsIgnoreCase("burger")) {
			food = new Burger();
		} else if (foodName.equalsIgnoreCase("pizza")) {
			food = new Pizza();
		}
		return food;
	}
}

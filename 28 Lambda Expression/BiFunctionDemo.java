import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static void main(String args[])
	{
		// BiFunction to demonstrate composite functions
		// Here it will find the sum of two integers
		// and then return twice their sum
		BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b;

		// Using addThen() method
		composite1 = composite1.andThen(a -> 2 * a);

		// Printing the results
		System.out.println("Composite1 = " + composite1.apply(2, 3));

		// BiFunction to demonstrate composite functions
		// Here it will find the sum of two integers
		// and then return twice their sum
		BiFunction<Integer, Integer, Integer> composite2 = (a, b) -> a * b;

		// Using addThen() method
		composite2 = composite2.andThen(a -> 3 * a);

		// Printing the result
		System.out.println("Composite2 = " + composite2.apply(2, 3));
	}
}

/* import java.util.function.BiFunction;
public class Main {
	public static void main(String args[])
	{
		// BiFunction which finds the sum of 2 integers
		// and returns twice their sum
		BiFunction<Integer, Integer, Integer> composite = (a, b) -> a + b;
		// Using addThen() method
		composite = composite.andThen(a -> a / (a - 5));
		try {
			// Printing the result using apply()
			System.out.println("Composite = " + composite.apply(2, 3));
		}
		catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
} */

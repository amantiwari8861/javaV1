package numbers;


/** Demonstrate the easy way of getting random numbers,
 * using java.lang.Math.Random().
 */
public class Random1 {
	public static void main(String[] argv) {
		// tag::main[]
		// java.lang.Math.random() is static, don't need to construct Math
		System.out.println("A random from java.lang.Math is " + Math.random());
		// end::main[]
	}
}

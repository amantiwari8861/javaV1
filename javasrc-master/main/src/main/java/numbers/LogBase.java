package numbers;

/**
 * Log to arbitrary base
 * @author Ian F. Darwin, http://www.darwinsys.com/
 */
public class LogBase {
	// tag::main[]
	public static double log_base(double base, double value) {
		return Math.log(value) / Math.log(base);
	}
	// end::main[]
}

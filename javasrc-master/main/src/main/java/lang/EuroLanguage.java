package lang;

/* Make sure the compiler accepts European languages everywhere.
 * May require a locale to be set before it will compile!
 * But if you rename the class to, say, Espa�ol, many runtimes will be confused.
 */
public class EuroLanguage {
	public static int n�mero;
	public static void main(String[] args) {
		System.out.println("Acci�n!");
		acci�n(123);
		System.out.println("N�mero = " + n�mero);
	}
	public static void acci�n(int costa) {
		System.out.println("Su tarjeta cuesta los " + costa);
		n�mero++;
	}
}


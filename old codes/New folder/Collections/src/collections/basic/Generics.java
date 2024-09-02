package collections.basic;

/**
 * @author Aman_Tiwari
 *
 */
//public class Generics {
//	public static void main(String[] args) {
//		Integer i=50;
//		System.out.println("aman".getClass().getName());
//		System.out.println("aman".getClass());
//		System.out.println(i.getClass().getName());
//		System.out.println(i.getClass());	
//	}
//
//}

//A Simple Java program to show working of user defined
//Generic classes

//We use < > to specify Parameter type
//class Test<T>
//{
//	// An object of type T is declared
//	T obj;
//	Test(T obj) { this.obj = obj; } // constructor
//	public T getObject() { return this.obj; }
//}
//
//class Main
//{
//	public static void main (String[] args)
//	{
//		// instance of Integer type
//		Test <Integer> iObj = new Test<Integer>(15);
//		System.out.println(iObj.getObject());
//
//		// instance of String type
//		Test <String> sObj =
//						new Test<String>("Aman");
//		System.out.println(sObj.getObject());
//	}
//}

class Generics
{
	// A Simple Java program to show working of user defined
	// Generic functions

		// A Generic method example
		static <T> void genericDisplay (T element)
		{
			System.out.println(element.getClass().getName() +
							" = " + element);
		}

		// Driver method
		public static void main(String[] args)
		{
			// Calling generic method with Integer argument
			genericDisplay(11);

			// Calling generic method with String argument
			genericDisplay("Aman");

			// Calling generic method with double argument
			genericDisplay(1.0);
		}
	}






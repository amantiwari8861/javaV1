package structure;

import java.util.*;

// tag::main[]
public class ArrayListGenericDemo {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<>();
		data.add("hello");
		data.add("goodbye");

		// data.add(new Date()); This won't compile!

		data.forEach(s -> System.out.println(s));
	}
}
// end::main[]

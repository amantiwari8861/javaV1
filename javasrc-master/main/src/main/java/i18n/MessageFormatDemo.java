package i18n;

import java.text.*;

// tag::main[]
public class MessageFormatDemo {

	static Object[] data = {
			new java.util.Date(),
			"lines.txt",
			"could not be opened"
	};

	public static void main(String[] args) {
		String result = MessageFormat.format(
			"At {0,time} on {0,date}, {1} {2}.", data);
		System.out.println(result);
	}
}
// end::main[]

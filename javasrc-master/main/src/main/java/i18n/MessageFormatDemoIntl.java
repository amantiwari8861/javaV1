package i18n;

import java.text.*;
import java.util.*;

// tag::main[]
public class MessageFormatDemoIntl {

	private static Date date = new Date();
	private static String fileName = "lines.txt";

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("Widgets");
		String format = rb.getString("filedialogs.cantopen.format");
		String result = MessageFormat.format(format, date, fileName);
		System.out.println(result);
	}
}
// end::main[]

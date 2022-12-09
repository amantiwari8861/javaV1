package io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// tag::main[]
		String sampleDate = "25 Dec 1988";

		try (Scanner sDate = new Scanner(sampleDate)) {
			int dayOfMonth = sDate.nextInt();
			String month = sDate.next();
			int year = sDate.nextInt();
			System.out.printf("%d-%s-%02d%n", year, month, dayOfMonth);
		}
		// end::main[]
	}
}

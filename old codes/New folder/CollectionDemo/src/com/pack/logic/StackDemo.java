package com.pack.logic;
import java.util.Stack;
public class StackDemo {
	static int i=0;
	public static void main(String[] args) {
		Stack<String> box=new Stack<String>();
		box.push("Book 1");
		box.push("Book 2");
		box.push("Book 3");
		box.push("Book 4");
		box.push("Book 5");
//		System.out.println(box);
//		System.out.println(box.isEmpty());
//		System.out.println(box.empty());
//		System.out.println(box);
		
		Object arr[]=box.toArray();
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		String arr2[]=new String[box.size()];
		
		box.forEach(book->{
		System.out.println(book);
		arr2[i++]=book;
		});
		System.out.println("-----------------------------------------");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
			
		}
	}

}

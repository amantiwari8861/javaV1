package com.pack.logic;

import java.util.Arrays;
import java.util.LinkedList;
//import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> merilist=new LinkedList<String>();//doubly
		merilist.add("sujata");
		merilist.addAll(Arrays.asList("anjali","sourabh","avinash","aman"));
//		merilist.forEach(name->{
//			System.out.println(name);
//		});
		
//		ListIterator<String> li=merilist.listIterator(merilist.size());	
//		while (li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
//		merilist.remove();
//		merilist.forEach(name->{System.out.println(name);});		
//		merilist.removeLast();
//		merilist.forEach(name->{System.out.println(name);});
//		merilist.offerFirst("kamal");
//		merilist.push("ritik");
//		merilist.pop();
		merilist.set(3, "ritik roshan");
//		merilist.forEach(name->{System.out.println(name);});
//		System.out.println(merilist.get(3));
		merilist.clear();
		merilist.forEach(name->{System.out.println(name);});
		System.out.println(merilist.isEmpty());
		



	}

}

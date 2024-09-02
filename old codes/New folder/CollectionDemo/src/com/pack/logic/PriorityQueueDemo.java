package com.pack.logic;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<String> qu1=new PriorityQueue<String>();
		//only smallest element will be sorted and come to first place
		qu1.add("raman");
		qu1.add("caman");
		qu1.add("aman");
		qu1.add("chaman");
		qu1.add("phaman");
		qu1.add("naman");
		
		System.out.println(qu1);
		qu1.remove();
		System.out.println(qu1);
		qu1.remove();
		System.out.println(qu1);
		
		Queue< Integer> q2=new PriorityQueue<Integer>();
		
		q2.add(5);
		q2.add(3);
		q2.add(1);
		q2.add(7);
		
		System.out.println(q2);
		
		
		
		
		
	}

}

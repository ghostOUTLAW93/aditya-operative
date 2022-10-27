package com.operative.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListImplementation {

	public static void main(String[] a) {
		
		LinkedList ll = new LinkedList();
		
		ll.add("a");
		ll.add("a");
		ll.add(2);
		ll.add(null);
		System.out.println(ll);
		
		ll.set(1, ll);
		System.out.println(ll);
		
		ll.addFirst("first");
		System.out.println(ll);
		
		Vector v = new Vector();
	
	}
}

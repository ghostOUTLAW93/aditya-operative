package com.operative.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {

	int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		MyComparator mc = new MyComparator();
		
		TreeSet t = new TreeSet(mc);
		t.add(10);
		t.add(20);
		t.add(30);
		
		System.out.println(t);

		
	}

}

package com.operative.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Serializable> al = new ArrayList<Serializable>();
		al.add("a");
		al.add('a');
		al.add('b');
		al.add(1);
		al.add(null);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		al.add(2, al);
		System.out.println(al);
		
		System.out.println(al instanceof Cloneable);
		
		//Collections has utility which can make the list of array list (which by default is NON-SYNCHRONIZED)
		//Collection.synchronizedList()
		
		List l = (List) Collections.synchronizedList(al);
		System.out.println(l);
	}

}

package com.capg;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new Vector<String>();// new  //ArrayList<String>();
		List<String> myList=  getMyList(list);
		System.out.println(myList);
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			String s=(String) it.next();
			System.out.println(s);
			
		}
    /*  for (String s : myList) {
    	  System.out.println(s);
		
	}*/
	}
	

public  static List<String> getMyList(List<String> a) {
	a.add("king");
	a.add("javeed");
	a.add("chandu");
	a.add("reddy");
	a.remove(0);
	return a;
}
	
}

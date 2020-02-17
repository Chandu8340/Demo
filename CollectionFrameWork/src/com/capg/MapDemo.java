package com.capg;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Employee, String> map=new Hashtable<Employee, String>();
		  Employee e1=new Employee(101, "chandu",5000);
		   Employee e2=new Employee(102, "chandu",5000);
		   Employee e3=new Employee(103, "chandu",5000);
		   Employee e4=new Employee(104, "chandu",5000);
		map.put(e1,"B");
		map.put(e2,"A");
		map.put(e3,"C");
		map.put(e4,"K");
		System.out.println(map);
		Set<Employee> set=map.keySet();
		Collection <String> c=map.values();
		Iterator<Employee> it= set.iterator();
		while (it.hasNext()) {
			Employee key =  it.next();
			System.out.println(key +" "+map.get(key));
			
		}
		
		
		

	}

}

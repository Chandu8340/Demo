package com.capg;

import java.util.HashSet;
import java.util.Set;

public class HashCode {

	public static void main(String[] args) {
		 Set<Employee> set =new HashSet<Employee>();
   Employee e1=new Employee(101, "chandu",50000);
   Employee e2=new Employee(102, "chandu",50000);
   Employee e3=new Employee(103, "chandu",50000);
   Employee e4=new Employee(104, "chandu",50000);
   set.add(e1);
   set.add(e2);
   set.add(e3);
   set.add(e4);
   System.out.println(set);
   
	}

}

package com.capg.user;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capg.beans.Customer;
import com.capg.dao.CustomerDAO;

public class UserName {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CustomerDAO cust=new CustomerDAO();
		while(true) {
		System.out.println("welcome");
		System.out.println("1.Add");
		System.out.println("2.Display");
		System.out.println("3.Exit");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter ur id ;");
			int cid=scan.nextInt();
			System.out.println("enter ur name ;");
			String cname=scan.nextLine();
			scan.nextLine();
			System.out.println("enter your Amount");
			double amount=scan.nextDouble();
			Customer c=new Customer();
			c.setCid(cid);
			c.setCname(cname);
			c.setAmount(amount);
			//CustomerDAO cust=new CustomerDAO();
			//cust.addCustomer(c);
			cust.getData();
			boolean a=cust.addCustomer(c);
			if(a==true) {
				System.out.println("customer is added");
			}
			else {
				System.out.println("customer is not added");
			}
			break;
		case 2:
			Map m=cust.getData();
			Set s=m.keySet();
			Iterator itr =s.iterator();
			while(itr.hasNext());{
				System.out.println(itr.next());
			}
		case 3: 
			System.exit(0);
			default :
				System.out.println("invalid input");
				break;
			}
			
			
			
			
		}
		
		}
		
		
		
		
	    
		
		
	
	}



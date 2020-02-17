package com.capg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args)throws FileNotFoundException {
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("Data.properties");
		try {
			prop.load(fis);
			//Enumeration enum=prop.keys();
			
			
			String username=prop.getProperty("username");
			String pass=prop.getProperty("password");
			String city=prop.getProperty("city.name");
			
			System.out.println(username);
			System.out.println(pass);
			System.out.println(city);
			System.out.println(prop);
		/*	Enumeration<String> enum=prop.keys();
			while (enum.hasMoreElements()) {
				string s = (string) enum.nextElement();*/
				
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}

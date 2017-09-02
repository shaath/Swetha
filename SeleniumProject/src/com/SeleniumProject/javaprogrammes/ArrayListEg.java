package com.SeleniumProject.javaprogrammes;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		x.add("Selenium");
		x.add("Swetha");
		x.add(50000);
		x.add('M');
		x.add("Swetha");
		x.add(2, "UFT");
		
		//Finding the size of the arraylist
		System.out.println(x.size());
		
		//Reading the data from arraylist
//		System.out.println(x.get(2));
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}
		
		

	}

}

package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[5];
		
		System.out.println(x.length);
		
		//Writing the data into array
		
		x[1]="Selenium";
		x[3]=50000;
		x[1]=30000;
//		x[5]="Swetha";
		
		//reading the from array
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}

	}

}

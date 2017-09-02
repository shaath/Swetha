package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args)
	{
		Object[] x={"Selenium",'M',300000,3333.33,true};
		
		System.out.println(x.length);
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}

	}

}

package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args)
	{
		int[] s={20000,30000,40000,50000,30000};
		
		//Finding the length of the array
		
		System.out.println(s.length);
		//Reading the data from array
//		System.out.println(s[2]);
		
//		for (int i = 0; i < s.length; i++)
//		{
//			System.out.println(s[i]);
//		}
		
		for (int data : s)
		{
			System.out.println(data);
		}

	}

}

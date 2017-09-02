package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args) 
	{
		String x="Swetha";//ahtewS
		//Finding the length of the string
		System.out.println(x.length());
		
		
//		System.out.println(x.charAt(3));
//		
//		System.out.println(x.substring(1, 4));
//		
//		System.out.println(x.toUpperCase());
//		
//		System.out.println(x.toLowerCase());
//		
//		System.out.println(x.replace("t", "s"));
//		
//		System.out.println(x.trim());
		
		for (int i = 0; i < x.length(); i++) 
		{
			System.out.println(x.charAt(i));
		}
		System.out.println("***************");
		for (int i = x.length()-1; i >= 0; i--) 
		{
			System.out.print(x.charAt(i));
		}
		
		
	}

}

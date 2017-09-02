package com.SeleniumProject.javaprogrammes;

public class TwoDinArrayEg {

	public static void main(String[] args) 
	{
		Object[][] x=new Object[2][3];
		
		System.out.println(x.length);
		
		System.out.println(x[0].length);
		
		x[0][1]="Swetha";
		x[1][2]="Selenium";
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}

	}

}

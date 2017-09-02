package com.SeleniumProject.javaprogrammes;

import java.util.Scanner;

public class IfEg {

	public static void main(String[] args) 
	{
//		int a=30;
//		int b=200;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		
		if(a > b)
		{
			System.out.println("A is Greater");
		}
		else
		{
			System.out.println("B is Greater");
		}

	}

}

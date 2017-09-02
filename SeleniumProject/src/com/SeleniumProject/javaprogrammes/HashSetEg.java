package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args)
	{
		Set<Object> s=new HashSet<Object>();
		//Wrirting the data into hashset
		s.add("Selenium");
		s.add("Swetha");
		s.add(30000);
		s.add(true);
		s.add('M');
		s.add("Selenium");
		
		Iterator<Object> it=s.iterator();
		
		while (it.hasNext())
		{
			Object text=it.next();
			System.out.println(text);
		}

	}

}

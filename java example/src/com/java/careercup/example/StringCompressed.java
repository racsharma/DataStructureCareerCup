package com.java.careercup.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringCompressed {

	
	public static void main(String args[])
	{
		System.out.println("I am printed");
		Scanner scan = new Scanner(System.in);
		String stringToBeCompressed = scan.nextLine();
		//String stringToBeCompressed = args[0];
		List<Character> arrlist = new ArrayList<Character>();
		for(int i=0;i<stringToBeCompressed.length();i++)
		{
			arrlist.add(stringToBeCompressed.charAt(i));
		}
		System.out.println("mid of the program");
		for(int i=0;i<stringToBeCompressed.length();i++)
		{
			int freq = Collections.frequency(arrlist, stringToBeCompressed.charAt(i));
			System.out.println("Frequency of "+ stringToBeCompressed.charAt(i)+ "  is:   "+freq);
		}
		System.out.println("End of the program");
	}
	
		
	
}

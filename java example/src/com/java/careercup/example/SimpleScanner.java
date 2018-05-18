package com.java.careercup.example;

import java.util.Scanner;

public class SimpleScanner {
	
 public static void main (String args[])
 {
	 System.out.println("Input the first no to add");
	 Scanner scan = new Scanner(System.in);
	 int num1 = scan.nextInt();
	 System.out.println("Input the second no to add");
	 int num2 = scan.nextInt();
	 int num3= num2+num1;
	 System.out.println("Sum of number "+num3);
	 scan.close();
 }

}

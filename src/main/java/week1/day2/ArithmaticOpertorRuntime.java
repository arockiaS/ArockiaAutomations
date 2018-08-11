
package week1.day2;

import java.util.Scanner;

public class ArithmaticOpertorRuntime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		int numberOne=scr.nextInt();
		System.out.println("\nEnter the First Number: ");
		int numberTwo=scr.nextInt();
			
		int add=numberOne+numberTwo;
		int multiply=numberOne*numberTwo;
		int divident=numberOne/numberTwo;
		int difference=numberOne-numberTwo;
		System.out.println("Results by Arithmatic Oerations:");
		System.out.println("Addition of given Numbers is: +"+add);
		System.out.println("Difference of given Numbers is: +"+difference);
		System.out.println("Multiplication of given Numbers is: +"+multiply);
		System.out.println("Divident of given Numbers is: +"+divident);

	}

}

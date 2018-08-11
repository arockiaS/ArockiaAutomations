
package week1.day2;

import java.util.Scanner;

public class RelationalOpertorRuntime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		
		
		System.out.println("Enter the NumberOne=");
		int number1=scr.nextInt();
		System.out.println("\nEnter the NumberTwo=");
		int number2=scr.nextInt();
		
		System.out.println("\nPrint Relational Operator Results:");
		System.out.println("Is numberOne is Equal to numberTwo: "+(number1==number2));
		System.out.println("Is numberOne is not Equal to number2Two: "+(number1!=number2));
		System.out.println("Is numberOne is greater than number2Two: "+(number1>number2));
		System.out.println("Is numberOne is greater than or Equal to number2Two: "+(number1>=number2));
		System.out.println("Is numberOne is less than number2Two: "+(number1<number2));
		System.out.println("Is numberOne is less than or equal to number2Two: "+(number1<=number2));
	}

}

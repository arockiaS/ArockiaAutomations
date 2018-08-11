
package week1.day2;

import java.util.Scanner;

public class BitwiseOperatorRuntime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Print the NumberOne:");
		int number1=scr.nextInt();
		
		System.out.println("Print the NumberTwo:");
		int number2=scr.nextInt();
		
				
		System.out.println("Print the NumberTwo="+number2);
		System.out.println("\nPrint Relational Operator Results:");
		System.out.println("And Operator Result is: "+(number1&number2));
		System.out.println("OR Operator Result is: "+(number1|number2));
		System.out.println("XOR Operator Result is: "+(~number1));
		System.out.println("Complement Operator Result is: "+(number1^number2));
		}

}

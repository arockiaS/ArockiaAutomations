
package week1.day2;

public class BitwiseOperator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number1=60;
		int number2=13;
		System.out.println("Print the NumberOne="+number1);
		System.out.println("Print the NumberTwo="+number2);
		System.out.println("\nPrint Relational Operator Results:");
		System.out.println("And Operator Result is: "+(number1&number2));
		System.out.println("OR Operator Result is: "+(number1|number2));
		System.out.println("XOR Operator Result is: "+(~number1));
		System.out.println("Complement Operator Result is: "+(number1^number2));
		}

}

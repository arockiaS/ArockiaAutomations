
package week1.day2;

public class IncrementDecrementOperator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number1=2;
		//int number2=10;
		int incrementNumber1=++number1;
		int incrementNumber2=number1++;
		int decrementNumber3=--number1;
		int decrementNumber4=number1--;
		
		
		System.out.println("Print the which operaton to be performed:"+number1);
		
		/*System.out.println("\nPrint Increment or Decrement Operator Results:");
		System.out.println("increment of given Number is(i++): "+(number1++));
		System.out.println("decrement of given Number is(i--): "+(number1--));
		System.out.println("increment of given Number is(++i): "+(++number1));
		System.out.println("decrement of given Number is(--i): "+(--number1));
		*/
		System.out.println(incrementNumber1);
		System.out.println(incrementNumber2);
		System.out.println(decrementNumber3);
		System.out.println(decrementNumber4);
		
	}

}

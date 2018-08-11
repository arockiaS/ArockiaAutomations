
package week1.day2;

public class TernaryOperatorArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] numberOne= {45,12,56,78,90,87,76,655,56,45,89,4,};
		int numberTwo=numberOne[0];
		
		for(int cmpNumber:numberOne)
		{
		
			int numberT = (numberOne[cmpNumber]<numberTwo?75:150);
			numberTwo=numberT;
		System.out.println("NumberTwo Result is: "+numberTwo);
		}
		}

}

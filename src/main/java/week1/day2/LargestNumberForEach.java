package week1.day2;

public class LargestNumberForEach 
{
	/*static int[] numberList= {22,32,44,-22,-9,1212,-12322};
	static int max=numberList[0];
	static int min=numberList[0];
	*/
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] numbersList= {12,-3433,2424,-239,3535212,-34536464};
		int max=numbersList[0];
		int min=numbersList[0];
		
		for(int largestNum:numbersList)
		{
			if(largestNum>max)
			{
				max=largestNum;
			}
		}
		
		for(int smallestNumber:numbersList)
		{
			if(smallestNumber<min);
			{
				min=smallestNumber;
			}
		}
				
	System.out.println("Largest Number in the Array is: "+max);
	System.out.println("Smallest Number in the given Arrary is: "+min);
	}
	
}


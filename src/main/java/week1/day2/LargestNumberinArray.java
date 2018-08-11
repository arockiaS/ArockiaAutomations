package week1.day2;

public class LargestNumberinArray 
{
	static int[] numberList= {22,32,44,-22,-9,1212,-12322};
	static int max=numberList[0];
	static int min=numberList[0];
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int j=0;j<=6;j++)
		{
			if(numberList[j]<min)
			{
				min=numberList[j];
			}
		}
		
		for(int i = 1;i<=6;i++)
		{
			if(numberList[i]>max)
			{
				max=numberList[i];
			}
		}
		
	System.out.println("Largest Number in the Array is: "+max);
	System.out.println("Smallest Number in the gien Arrary is: "+min);
	}
	
}


package week4.homework;

public class Audicar extends Car
{
	static String nameCar;
	public static void audicar(String nameCar)
	{
		nameCar="Audi";
		System.out.println("child class name is: "+nameCar);
		car(nameCar);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		audicar(nameCar);
		
		

	}

}

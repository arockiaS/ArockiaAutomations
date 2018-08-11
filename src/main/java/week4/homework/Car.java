package week4.homework;

public class Car extends Vehicle
{
	public static void car(String carName)
	{
		carName="branded";
		System.out.println("Print parent class name is :"+carName);
		Vehicle veh=new Vehicle();
		veh.vehicle(carName);
	
	}

}

package automation;

public class PrintMyDetails {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Object Creation
		MyDetails MD=new MyDetails();
		
		//Call be object Variable
		System.out.println("Calling the Values as Variables");
		System.out.println(MD.myName);
		System.out.println(MD.myAge);
		System.out.println(MD.myFavoritecolor);
		
		//Call be object method
		System.out.println("Calling the Values as Method");
		MD.displayMydetails();		

	}

}

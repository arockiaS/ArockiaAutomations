package automation;

public class PrintFriendsDetails {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Object Creation
		MyFriendsDetails MFD=new MyFriendsDetails();
		
		//Call be object method
		System.out.println("Calling the Values as Method");
		MFD.displayFirstFriendDetails();
		MFD.displaySecondFriendDetails();

	}

}

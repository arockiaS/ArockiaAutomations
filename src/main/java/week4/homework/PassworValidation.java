package week4.homework;

import java.util.Scanner;

public class PassworValidation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the Password:");
		String password =scr.next();
		 if(password.matches("^(?=.*[0-9]{2,})(?=.*[a-z])(?=.*[A-Z]).{10,}$"))
		 { 
		        System.out.println("Captured password follows valid format");
		        System.out.println("Captured Password is:"+password); 
		 }else
		 {
			 System.out.println("Please Enter Valid Password");
		 }

	}

}

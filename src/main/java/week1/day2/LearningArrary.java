package week1.day2;

import java.util.Scanner;

public class LearningArrary {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int totalNumberStudent=5;
		//totalNumberStudent=totalNumberStudent-1;
		String[] studentName= {"Arockia","Ananth","raj","Venky","Vijay"};
		int[] studentAge= {23,23,24,25,26,};
		char[][] studentGrade= {{'A','B','C','D','F'},{'A','B','A','D','F'},{'A','A','C','D','F'},{'A','A','A','A','F'},{'B','B','B','B','F'}};
		Scanner scr=new Scanner(System.in);
					
		for(int i=0;i<=totalNumberStudent;i++)
		{
			System.out.println("\nEnter the Student Number to view details");
			int studentNumber=scr.nextInt();
			studentNumber=studentNumber-1;
			System.out.println(studentName[studentNumber]+" is "+studentAge[studentNumber]+" Years old and he scored "+studentGrade[studentNumber][0]+","+studentGrade[studentNumber][1]+","+studentGrade[studentNumber][2]+","+studentGrade[studentNumber][3]+","+studentGrade[studentNumber][4]);
			
		}
		
	}

}

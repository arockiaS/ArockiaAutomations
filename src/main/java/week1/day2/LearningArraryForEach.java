package week1.day2;

import java.util.Scanner;

public class LearningArraryForEach {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//totalNumberStudent=totalNumberStudent-1;
		String[] studentName= {"Arockia","Ananth","raj","Venky","Vijay"};
		int[] studentAge= {23,23,24,25,26,};
		char[][] studentGrade= {{'A','B','C','D','F'},{'A','B','A','D','F'},{'A','A','C','D','F'},{'A','A','A','A','F'},{'B','B','B','B','F'}};
		Scanner scr=new Scanner(System.in);
			
		System.out.println("Print Students Name:");
		for(String studentsName:studentName)
		{
			System.out.println(studentsName);
			
		}
		
		System.out.println("\nPrint Students Age:");
		for(int studentsAge:studentAge)
		{
			System.out.println(studentsAge);
			
		}
		
	}

}

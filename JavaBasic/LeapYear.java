package JavaBasic;

import java.util.Scanner;

public class LeapYear {
	
	public static Boolean isLeapYear(int y)
	{
		if(y%4== 0  && y%100 != 0 || y%400 ==0)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a year to check if its  Leap Year or Not");
		int year;
		Scanner sc= new Scanner(System.in);
		year= sc.nextInt();

		if(isLeapYear(year))
		{
			System.out.println(year+ " is a LeapYear");

		}
		else
		{
			System.out.println(	year+ " is not a Leap Year");

		}
		
	}

}

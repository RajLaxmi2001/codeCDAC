package JavaBasic;

import java.util.Scanner;

public class StudentDetails {
	public static String findResult(float m)
	{
		if(m>60)
		{
			System.out.println("Pass");
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Student Details");
		
		int stuId;
		String name;
		String subject;
		float marks;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ");
		stuId= sc.nextInt();
		name= sc.nextLine();
		subject= sc.nextLine();
		marks= sc.nextFloat();
		System.out.println(findResult(marks));
		
	}

}

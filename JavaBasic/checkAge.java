package JavaBasic;

import java.util.Scanner;

public class checkAge {
	
	public static void findResult(int age) {
		age= age+1;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter the age to check Eligibility :");
		int age;
		Scanner sc= new Scanner(System.in);
	    age = sc.nextInt();
     
	    findResult(age);
	}
}

package arrayPractices;

import java.util.Scanner;

public class SumOfDigits {
	public static int sum(int num)
	{
		int sum=0;
		while(num !=0)
		{
			sum += num %10;
			num = num/10;		
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number to calculate the sum of its digits : ");
		int num=sc.nextInt();
		
		System.out.println("Sum of digits is : "+	sum(num));
	}

}

package JavaBasic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void checkFibonacci(int n)
	{
		int a=0,b=1,fib;
		
		if(n<=0)
		{
		 System.out.println("Sorry Dude! please enetre a positive number");
		}
		
		System.out.print(a);
		for(int i=2; i<n ; i++)
		{
			fib= a+b;
			System.out.print(" "+ fib);
			a=b;
			b=fib;
		}
		System.out.println();
		
		
	}
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number to find fibonacci : ");
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		
	    checkFibonacci(num);
		
	}

}

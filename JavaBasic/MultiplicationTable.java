package JavaBasic;

import java.util.Scanner;

public class MultiplicationTable {
	public static void MulTable(int n, int l)
	{
		for(int i=1; i<=l; i++)
		{
			System.out.println(n + "*" + i +" is "+(n*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find the multiplication table : ");
		int num;
		num=sc.nextInt();
		
		System.out.println("Enter the limit till long we need to print the table : ");
		int limit;
		limit=sc.nextInt();
		
		MulTable(num, limit);
	}

}

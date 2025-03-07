package JavaBasic;

import java.util.Scanner;

public class PrintNumbers {
	public static void print(int n)
	{
		for(int i=0; i<= n; i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		print(num);
		
	}

}

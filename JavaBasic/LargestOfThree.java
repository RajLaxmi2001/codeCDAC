package JavaBasic;

import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ënter Three numbers to check the largest among 3");
		n1= sc.nextInt();
		n2= sc.nextInt();
		n3= sc.nextInt();
		
		if(n1 > n2 && n1> n3)
		{
			System.out.println(n1+" is largest" );
		}
		else if(n2>n3 && n2> n1)
		{
			System.out.println(n2+" is largest");
		}
		else
		{
			System.out.println(n3+" is largest");
		}
	}

}

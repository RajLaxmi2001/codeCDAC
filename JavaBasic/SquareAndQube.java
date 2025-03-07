package JavaBasic;
import java.math.*;
import java.util.Scanner;

public class SquareAndQube {
	public static int square(int n)
	{
		System.out.println("Square of "+n+ " is "+Math.pow(n,2));
		return n;
	}
	
	public static int Qube(int n)
	{
		System.out.println("Qube of "+n+ " is "+Math.pow(n,3));
		return n;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find square and cube : ");
		int num= sc.nextInt();
		
		square(num);
		Qube(num);
	}

}

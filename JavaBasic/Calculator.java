package JavaBasic;

import java.util.Scanner;

public class Calculator {
	public static int add(int n1, int n2) {
		int sum= n1+ n2;
		return sum;
		
	}
	public static int sub(int n1, int n2) {
		int sub= n1 - n2;
		return sub;
		
	}
	public static int mul(int n1, int n2) {
		int mul= n1 * n2;
		return mul;
		
	}
	public static int div(int n1, int n2) {
		int div= n2/n1;
		return div;
		
	}
	public static int modulus(int n1, int n2) {
		int mod= n1% n2;
		return mod;
		
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr two numbers to make a calculation");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
	
		System.out.println("Addition of two number is: "+add(num1,num2));
		System.out.println("Substraction of two number is: "+sub(num1,num2));
		System.out.println("Multiplication of two number is: "+mul(num1,num2));
		System.out.println("Division of two number is: "+div(num1,num2));
		System.out.println("Modulus of two number is: "+modulus(num1,num2));
		
	}

}

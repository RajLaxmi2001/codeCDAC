package JavaBasic;

import java.util.Scanner;

public class SumValuesOfArray {
	
	public static void arraySum(int arr[], int size)
	{
		int sum=0;
		for(int i=0; i< size; i++)
		{
			sum += arr[i];
		}
		System.out.println("Total sum of an array is "+sum);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome :) ");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the size of an array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter an "+ size +" size array to calculate the sum of the elements");
		for(int i=0; i< size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		arraySum(arr,size);
	}

}

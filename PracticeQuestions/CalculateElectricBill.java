package PracticeQuestions;

import java.util.Scanner;

public class CalculateElectricBill {
	public static double Calculate(int unit)
	{
	   int price;
	   if(unit <=100)
	   {
		price= unit *1;
	   }
	   else if(unit <=200)
	   {
		   price = (100*1)+((unit - 100)*2);
	   }
	   else
	   {
		   price= (100 *1) +(100 * 2)+((unit-200)*3);
	   }
	   return price;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter unit to calculate the electric bill: ");
		int units = sc.nextInt();
	
		System.out.println("Price per unit is : "+Calculate(units));
		
	}

}

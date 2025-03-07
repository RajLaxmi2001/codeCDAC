package PracticeQuestions;

import java.util.Scanner;

public class CalculateEBill2 {
	public static double Calculate(int unit)
	{
	   double price = 0;
	   int unit_left= unit;
	   int rate=1;
	   double slab=100;
	   
	   while(unit_left >0)
	   {
		   double curr_unit = Math.min(unit_left, slab);
		   price += curr_unit *rate;
		   unit_left -= curr_unit;
		   rate++;
	   }
	   return price;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the unit to calculate the electric bill : ");
		int units=sc.nextInt();
		
		
		System.out.println("Calculated electric bill is : "+Calculate(units));
		sc.close();
	}

}

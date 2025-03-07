package arrayPractices;

import java.util.Scanner;

public class ReverseTheNumber {
	public static int reverse(int num)
	{
		int res=0;
		while(num != 0)
		{
			int rem =num%10;
			res= (res*10)+rem;
			num= num/10;
		
		}
	
		return res;
		
	}

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter a number : ");
			int num=sc.nextInt();
			
			System.out.println("Reverse of the number is : "+	reverse(num));
		}
	}



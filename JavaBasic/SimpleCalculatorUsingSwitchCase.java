package JavaBasic;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitchCase {
	public static void calculator(String click,int a, int b)
	{
		switch(click)
		{
		case "Add":
			System.out.println("Adition of two number is : "+(a+b));
			break;
		
	    case "Sub":
		    System.out.println("Substarction of two number is : "+(a-b));
		    break;
		    
	    case "Mul":
		    System.out.println("Substarction of two number is : "+(a*b));
		    break;
	    case "Div":
	    	
	    	if(b!=0)
	    	{
			   System.out.println("Substarction of two number is : "+(a/b));
			 }
	    	else
	    	{
	    		System.out.println("Better luck next time !! Enter a different number");
	    	}
		    break;
	    case "Modulus":
		    System.out.println("Substarction of two number is : "+(a%b));
		    break;
		   
		default:
			System.out.println("Enjoy baBE");
		
	   }
		
		
	}
        public static void main(String[] args) {
        	Scanner sc= new Scanner(System.in);
        	
        	System.out.println("Enter what operation you want : ");
        	String click= sc.next();
        	
        	System.out.println("Enter the first number : ");
        	int num1= sc.nextInt();
        	
        	System.out.println("Enter the second number : ");
        	int num2=sc.nextInt();
        	calculator(click,num1, num2);
        	
        	sc.close();
        	
	
}
}

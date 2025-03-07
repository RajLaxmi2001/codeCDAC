package arrayPractices;
import java.util.Scanner;

public class SimpleInterest {
	public static double simpleInterst(double p, double r, int t)
	{
		double simpleIn= (p*t*r)/100;
		return simpleIn;
	}
	public static double compoundInterst(double p, double r, int t)
	{
		double compoundIn= p*Math.pow(1+r/100,t)-p;
		return compoundIn;
	}
	public static void main(String[] args) {
	
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Principal amount: ");
	double principal= sc.nextDouble();
	
    System.out.println("Enter the Rate of Interest: ");
    double rate=sc.nextDouble();

    System.out.println("Enter the Time in Years: ");
    int time=sc.nextInt();
    
    System.out.println("Simple Interest is : "+ simpleInterst(principal,rate,time));
    System.out.println("Compound Interest is : "+ compoundInterst(principal,rate,time));

    

	}

}

package PracticeQuestions;
import java.util.Scanner;

public class AreaAndPeri {
	public static void Area(int l, int b)
	{
		System.out.println("The area of given rectangle is : "+l*b);
	}
	
	public static void Perimeter(int l, int b)
    {
		System.out.println("The perimeter of given rectangle is : "+2*(l+b));
	}
	
	
	public static void main(String[] args) {
		System.out.println("Area and Perimeter of the Rectangle ");
		System.out.println("------------------------------------------");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of a rectangle : ");
		int length = sc.nextInt();
		
		System.out.println("Enter the bredth of a rectangle : ");
		int bredth= sc.nextInt();
		
		Area(length, bredth);
		Perimeter(length, bredth);
		
		
	}

}

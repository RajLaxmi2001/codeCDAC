package JavaBasic;

import java.util.Scanner;

public class PyramidPattern {
	public static void pattern(int num)
	{
		// Loop through each row
        for (int i = 1; i <= num; i++) {
           
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
		
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number to build the number Pyramid");
		int num= sc.nextInt();
		
		pattern(num);
	}

}

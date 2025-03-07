//Take productId, productName .Find discount . if price>5000 ,5% discount otherwise 2%
package JavaBasic;

import java.util.Scanner;

public class Percentage {
	
	public static String productDiscount(int id,String name,float price)
	{
		if(price>5000)
			System.out.println("User will get 5% discount ");
		else
			System.out.println("User will get 2% discount ");
		return null;
		
	}
	
	
	public static void main(String[] args) {
		int product_id;
		String product_name;
		float cost_price;
		
	//	System.out.println("Enter the product Details");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Product Id: ");
		product_id= sc.nextInt();
		
		System.out.println("Enter the product name : ");
		product_name= sc.next();
		System.out.println("Enter the product price: ");
		cost_price= sc.nextFloat();
		
		productDiscount(product_id, product_name, cost_price);
		
	}

}

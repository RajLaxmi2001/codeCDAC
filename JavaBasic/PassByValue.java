package JavaBasic;

public class PassByValue {
	public static void change(int a , int b)
	{
		a=30;
		b=40;
		System.out.println("Value of a is "+ a +"Value of b is "+b);

	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Value of a is "+ a +" and Value of b is "+b);
		change(a,b);
		System.out.println("Value of a is "+ a +" Value of b is "+b);

	}

}

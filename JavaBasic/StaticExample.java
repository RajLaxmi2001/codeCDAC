package JavaBasic;

public class StaticExample {
	//static
	public static int add(int n3, int n4)
	{
		
		int sum=n3+n4;
		return sum;
	}
	//non static
	public int sub(int n1, int n2)
	{
		int sub= n1-n2;
		return sub;
	}
	public static void main(String[] args) {
		int num1=10;
		int num2=20;

		StaticExample.add(num1, num2);
		
		StaticExample se= new StaticExample();
		int sum= se.add(num1, num2);
		System.out.println("The sum is :"+sum);
//		
//		int sub= se.sub(num1, num2);
//		System.out.println("The sub is :"+sub);
	}

}

//we can call both the static and nonstatic method by the static procedure
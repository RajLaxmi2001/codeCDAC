package JavaBasic;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before Swapping value is: "+a+" and "+b);
		a=a+b; // 30
		b=a-b; //10
		a=a-b; //20
		System.out.println("After Swapping : "+a+" and "+b);
		
	}

}

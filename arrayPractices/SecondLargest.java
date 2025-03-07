package arrayPractices;

import java.util.Arrays;

public class SecondLargest {
	
	public static void main(String[] args) {
		int arr[]= {3,5,4,3,2,1};
		int n=arr.length;
		
		//using inbuilt method
	    Arrays.sort(arr);
		System.out.println("Sorted Array is : "+Arrays.toString(arr));
		System.out.println("Second Largest element is "+arr[arr.length-2]);

}
}

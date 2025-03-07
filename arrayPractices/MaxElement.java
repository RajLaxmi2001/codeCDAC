package arrayPractices;

public class MaxElement {
	public static int max(int arr[])
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
			 max= arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,6,3,5,87};
		int maxi= max(arr);
		System.out.println(maxi);
	}

}

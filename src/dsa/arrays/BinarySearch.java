package dsa.arrays;

public class BinarySearch 
{
	public static int binarySearch(int numbers[], int key)
	{
		int start =0, end = numbers.length-1;
		while (start<=end)		//Start = end when we are dealing with a single element array where start, mid and end are the same 
		{
			int mid =(start+ end)/2;
			//Comparison 
			if(numbers[mid]== key)
			{
				return mid;
			}
			else if (numbers[mid]> key) 		//We are going to search in the left of the array 
			{
				start = mid -1;
			}
			else 				//We are going to search in the right of the array 
			{
				start = mid+1;
			}
		}
		System.out.println("The given key does not match with any of the items in the array");
		return 0;
	}
	public static void main(String[] args) 
	{
		int a[]= {2,4,6,8,10,12,14,16,18,20};
		int key = 20;
		System.out.println("The index for key is "+ binarySearch(a, key));
		
	}

}

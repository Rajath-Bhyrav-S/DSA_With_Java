package dsa.arrays;

public class ReverseArray 
{
	public static void reverse(int numbers[]) {		//Return type is void because in java array is call by reference not call by value 
	    int start = 0, end = numbers.length - 1;
	    while (start < end) {
	        int temp = numbers[end];
	        numbers[end] = numbers[start];
	        numbers[start] = temp;
	        end--; // Decrement end instead of incrementing it
	        start++;
	    }
	}	
	
	public static void main(String[] args) 
	{
		int numbers[]= {1,2,3,4,5,6};
//		for(int i =0;i<=numbers.length;i++)
//		{
//		System.out.println("The original array is "+numbers[i]);
//		}
		
		//After calling the fucntion 
		reverse(numbers);
		System.out.println("The reversed array is ");
		for(int i = 0; i < numbers.length; i++)
		{
		    //System.out.println("The reversed array is ");
		    System.out.print(numbers[i]+" ");
		}

		
	}

}

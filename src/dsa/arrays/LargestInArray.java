package dsa.arrays;



public class LargestInArray 
{
	public static int FindTheLargest(int Number[])
	{
		int largest = Integer.MIN_VALUE;		//This is used to store the most min value in the variable, Which can also be called -infinity
		for(int i=0;i<Number.length;i++)
		{
			if(largest<Number[i])
			{
				largest=Number[i];
			}
		}
		return largest;
	}
	public static int FineTheSmallest(int Number[])
	{
		int smallest = Integer.MAX_VALUE;		//This is used to store the max value in the variable, Something like +infinity
		for(int i=0;i<Number.length;i++)
		{
			if(smallest>Number[i])
			{
				smallest = Number[i];
			}
		}
		return smallest;
	}
	public static void main(String[] args) 
	{
		int Numbers[]= {1,5,7,6,8};
		System.out.println("The largest number in the array is " + FindTheLargest(Numbers));
		System.out.println("The largest number in the array is " + FineTheSmallest(Numbers));
	}

}

package dsa.arrays;


import java.util.*;



public class LargestInArray 
{
	public static int FindTheLargest(int Number[])
	{
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<Number.length;i++)
		{
			if(largest<Number[i])
			{
				largest=Number[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) 
	{
		int Numbers[]= {1,5,7,6,8};
		System.out.println("The largest number in the array is" + FindTheLargest(Numbers));
		
	}

}

package dsa.arrays;

public class Pairs 
{
	public static void printPairs(int numbers[])
	{
		int totalPairs=0;
		for(int i=0; i<numbers.length;i++)		//Here we are keeping track of the first number that has to be printed 
		{
			int curr = numbers[i];
			for(int j=i+1;j<numbers.length;j++)		//Here we are keeping track of the second number to be printed 
			{
				System.out.print("("+curr+","+numbers[j]+")");			//Current number only changes after the J loop is completed (meaning when it reaches the end)
				totalPairs++;														//numbers[j] shows new numbers until the lenght of the number array is reached 
			}
			System.out.println();
		}
		System.out.println("The total number of pairs are "+totalPairs);
	}
	public static void main(String[] args) 
	{
		int numbers[]= {1,2,3,4,5,6,7,8,9};
		printPairs(numbers);
		
	}

}

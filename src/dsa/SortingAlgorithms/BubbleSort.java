package dsa.SortingAlgorithms;

public class BubbleSort 
{
	public static void SortTheArray(int arr[])
	{
		for(int turn=0;turn<arr.length-1;turn++) 		//This goes from 0 to lenght of the array -1 
		{
			for (int j=0;j<arr.length-1-turn;j++)		//This goes till lenght of the array - 1 - the number of turns 
			{
				if(arr[j]>arr[j+1])		//If the current element is bigger than the next element it has to be swapped 
				{
					//Swapping the variables 
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		 
	}
	public static void printSortedArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {5,4,1,3,2};
		SortTheArray(arr);
		printSortedArray(arr);
		

		
	}

}

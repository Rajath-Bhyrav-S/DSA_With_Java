package dsa.SortingAlgorithms;

public class InsertionSort 
{
	public static void selectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int minPostion=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[minPostion] > arr[j])
				{
					minPostion=j;
				}
			}
			//Swapping now
			int temp =arr[minPostion];
			arr[minPostion]= arr[i];
			arr[i]=temp;
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
		selectionSort(arr);
		printSortedArray(arr);
		
	}

}

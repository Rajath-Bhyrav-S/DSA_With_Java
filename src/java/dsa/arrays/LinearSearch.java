package java.dsa.arrays;

public class LinearSearch 
{
	public static int LS(int number[], int key)
	{
		for(int i=0;i<=number.length;i++)
		{
			if(number[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int numbers[]= {2,3,4};
		int key =4;
		int index = LS(numbers, key);
		if(index ==-1)
		{
			System.out.println("The Value is not found in the array");
		}
		else 
		{
			System.out.println("the value is in "+index+" position");
		}
		
	}

}

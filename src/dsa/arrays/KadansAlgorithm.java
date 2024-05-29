package dsa.arrays;

public class KadansAlgorithm 
{
	public static void kadans(int number[])
	{
		int maxSum =Integer.MIN_VALUE;
		int CurrSum=0;
		for(int i=0;i<number.length;i++)
		{
			CurrSum = CurrSum + number[i];
			if(CurrSum<0)
			{
				CurrSum =0;
			}
			maxSum = Math.max(CurrSum, maxSum);		//This function is used to calculate which amongst the 2 values is greater 
		}
		System.out.println("The maximum sum is "+maxSum);
	}
	public static void main(String[] args) 
	{
		int numbers[]= {-2,-3,4,-1,-2,1,5,-3};
		kadans(numbers);
//		int a=-1,b=-2;
//		int temp = Math.max(a, b);
//		System.out.println("Print "+temp);
//		
	}

}

package dsa.arrays;

public class MaxSubArraySum 
{
	public static void  MaxSubArray(int numbers[]) 
	{
		int currSum =0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++)
		{
			int start =i;
			for(int j=i;j<numbers.length;j++)
			{
				int end =j;
				currSum=0;
				for(int k=start;k<=end;k++)
				{
					currSum+=numbers[k];
				}
				System.out.println("These are the current sums "+currSum );
				if (maxSum <currSum)
				{
					maxSum = currSum;
				}
			}
		}
		System.out.println("Max sum is "+maxSum);
		
	}
	public static void main(String[] args) 
	{
		int number[]= {2,4,6,8,10};
		MaxSubArray(number);
	}

}

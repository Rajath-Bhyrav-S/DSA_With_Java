package dsa.arrays;

public class TrappedRainWaterProblem 
{
	public static int trappedWater(int height[])
	{
		int n=height.length;
		//calculate the left most boundary 
		int leftMax[]=new int[n];
		leftMax[0]=height[0];
		for(int i=1;i<n;i++)
		{
			leftMax[i]=Math.max(height[i],leftMax[i-1]);
		}
		
		//calculate the right most boundry 
		int rightMax[]=new int [n];
		rightMax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--)
		{
			rightMax[i]=Math.max(height[i], rightMax[i+1]);	
		}
		
		int trappedRain=0;
		//Loop now to caculate the rain water 
		//Water level = min (leftmax, right max)
		for(int i=0;i<n;i++)
		{
			int waterLevel=Math.min(leftMax[i], rightMax[i]);
			//trapped water = waterLevel - height [i]
			trappedRain += waterLevel-height[i];
		}
		return trappedRain;
	}
	public static void main(String[] args) 
	{
		int height[]= {4,2,0,6,3,2,5};
		System.out.println(trappedWater(height));
		
	}

}

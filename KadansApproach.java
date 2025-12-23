import java.util.*;
class KadansApproach
{
	public static void main(String[]args){
		int a[]={-3,8,-2,4};

		int max=Integer.MIN_VALUE;
		
		for (int i=0;i<a.length ;i++ )
		{
			int sum=0;
			sum=sum+a[i];
			if (sum>max)
			{
				max=sum;
			}
			
			if (sum<0)
			{
				sum=0;
			}
				
			
		}
		System.out.println("The Given Array is :"+Arrays.toString(a));
		System.out.println("Max Of Sub Array Sum is :"+max);
	}
}





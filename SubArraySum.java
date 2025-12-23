import java.util.*;
class SubArraySum
{
	public static int solve(int[]a){
		int max=Integer.MIN_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			int sum=0;
			for (int j=i;j<a.length ;j++ )
			{
				sum=sum+a[j];
				max=Math.max(sum,max);
			}
		}
		return max;
	}
	public static void main(String[]args){
		int[]a={-3,8,-2,4};
		System.out.println(solve(a));
	}
}




import java.util.*;
class FrequencyOFArray
{
	public static void findFrequency(int[]a){
		Arrays.sort(a);
		int count=1;
		for (int i=0;i<a.length-1 ;i++ )
		{
			if (a[i]==a[i+1])
			{
				count++;
			}else{
				System.out.println(a[i]+":"+count);
				count=1;
			}
		}
		System.out.println(a[a.length-1]+":"+count);
	}

	public static void main(String[]args){
		int a[]={1,2,3,2,1,2,3,4,4};
		findFrequency(a);
	}
}
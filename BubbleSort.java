import java.util.*;
class  BubbleSort
{
	public static void main(String[] args) 
	{
		int[]a={5,-33,-9,-33,44,33,-99};
		System.out.println(Arrays.toString(a));
		bubblesort(a);
	}
	public static void bubblesort(int[]a)
	{
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=0;j<a.length-1;j++ )
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}

import java.util.*;
class BubbleSort
{
	public static void main(String[]args){
		int[]a={10,9,8,7,6,5,4,3,2,1,0};

		for (int i=0;i<a.length-1;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[j]<a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int num:a){
			System.out.print(num+" ");
		}
	}
}
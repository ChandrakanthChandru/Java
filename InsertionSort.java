import java.util.*;
public class InsertionSort {
    public static void main(String[]args){
		int[]a={3,2,7,4,0};
		for (int i=1;i<a.length ;i++ )
		{
			int k=a[i];
			int j=i-1;
			if (a[j]>k)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
		for(int num:a){
			System.out.print(num+" ");
		}
    }
}

import java.util.*;	
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {10, 0, 2, 6, 9, 7};
		 for (int i=0;i<a.length-1 ;i++ )
		 {
			 int k=i;
			 for (int j=i+1;j<a.length ;j++ )
			 {
				 if (a[j]<a[k])
				 {
					 k=j;
				 }
			 }
			 int temp=a[i];
			 a[i]=a[k];
			 a[k]=temp;
		 }
	for(int num:a){
		System.out.print(num+" ");
	}
    }
}

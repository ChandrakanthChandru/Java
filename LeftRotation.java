import java.util.*;
class LeftRotation
{
	public static void main(String[]args){
		int[]a={10,20,30,40,50};
		System.out.println("Before Rotation :"+Arrays.toString(a));
		int last=a[0];
		for (int i=0;i<a.length-1;i++ )
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=last;
		System.out.println("after Rotation :"+Arrays.toString(a));
	}
}
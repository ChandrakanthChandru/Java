import java.util.*;
class RightRotation
{
	public static void main(String[]args){
		int a[]={20,30,40,50,10};
		System.out.println("Before Right Rotation :"+Arrays.toString(a));
		int last=a[a.length-1];
		for (int i=a.length-1;i>=1 ;i-- )
		{
			a[i]=a[i-1];
		}
		a[0]=last;
		System.out.println("After Right Rotation :"+Arrays.toString(a));
	}
}
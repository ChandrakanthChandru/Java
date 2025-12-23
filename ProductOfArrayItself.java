import java.util.*;
class ProductOfArrayItself
{
	public static void main(String[]args){
		int[]a={4,5,1,3};

		int[]pre=new int[a.length];
		int[]suf=new int[a.length];
		int[]res=new int[a.length];
		
		pre[0]=1;

		for(int i=1; i<a.length; i++){
			pre[i]=pre[i-1]*a[i-1];
		}
		suf[a.length-1]=1;

		for (int i=a.length-2;i>=0 ;i-- )
		{
			suf[i]=suf[i+1]*a[i+1];
		}
		for(int i=0; i<a.length; i++){
			res[i]=pre[i]*suf[i];
		}

		System.out.println("The Give Array Is :"+Arrays.toString(a));

		System.out.println("The Product Of Give Array Itself Is :"+Arrays.toString(res));
		
	}
}
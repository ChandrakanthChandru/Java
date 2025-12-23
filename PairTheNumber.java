import java.util.Scanner;
class PairTheNumber
{
/*p:{1,2,3,4,5} ex o/p: (1,2) (1,3) (1,4) (1,5)
	                        (2,3) (2,4) (2,5)
	                        (3,4) (3,5)
	                        (4,5)*/

	public static void main(String[]args)throws Exception{
		int[]a={10,20,30,40,50};

		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i;j<a.length ;j++ )
			{
				Thread.sleep(300);
				System.out.print("("+a[i]+","+a[j]+")"+"\t");
			}
			System.out.println();
		}
	}
}
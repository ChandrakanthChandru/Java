import java.util.Scanner;
class LinearSearch
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isThere(int[]a, int b){
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]==b){
				return true;
			}
		}
		return false;
	}
	public static void main(String[]args)throws Exception{
		int [] a={10,20,39,773,63};
		int find=79;
		System.out.print("Enter Element to find :");
		int target=sc.nextInt();
		System.out.println("Searching for the element "+target);
		Thread.sleep(2000);
		System.out.println(isThere(a,target)?"Element is Present":"Element is not Present");
	}
}
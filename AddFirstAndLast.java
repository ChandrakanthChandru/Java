import java.util.*;
class AddFirstAndLast 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter A number :");
		int num=sc.nextInt();
		int last=num%10;
		while(num>9){
			num=num/10;
		}
		System.out.println(num+last);
	}
}

import java.util.*;
class Xylem
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args){
		System.out.print("Enter A Number :");
		int num=sc.nextInt();
		int last=num%10;
		num=num/10;
		int ans=0;
		while(num>9){
			ans+=num%10;
			num/=10;
		}
		if (num+last==ans)
		{
			System.out.println("Xylem");
		}else
			System.out.println("Not Xylem");
	}
}
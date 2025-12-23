import java.util.*;
class HappyNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args){
		System.out.print("Enter a Number :");
		int num=sc.nextInt();
		int sum=0;
		while(num!=1 && num!=4){
			sum=0;
			while(num>0){
				sum=num%10 * num%10;
				num/=10;
			}
			num=sum;
		}
		if (num==1)
		{
			System.out.println("Happy Number");
		}else{
			System.out.println("Not a Happy Number");
		}
	}
}
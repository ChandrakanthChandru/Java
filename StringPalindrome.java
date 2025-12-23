import java.util.*;
class StringPalindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args){
		System.out.print("Enter A String :");
		String a=sc.nextLine();
		String rev="";
		for (int i=a.length()-1;i>=0 ;i-- )
		{
			rev+=a.charAt(i);
		}
		//System.out.println("The given String is :"+a);
		//System.out.println("Reversed String is :"+rev);
		if(rev.equals(a)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
		
	}
}
import java.util.*;
class Anagram
{
	public static boolean checkPan(String s1, String s2){
		char[]a=s1.toCharArray();
		char[]b=s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a,b);
	}
	public static void main(String[] args) 
	{
		String s1="earth";
		String s2="heart";
		System.out.println("String 1 :"+ s1);
		System.out.println("String 2 :"+ s2);
		System.out.println(checkPan(s1,s2)?"Anagram":"Not An Anagram");
	}
}

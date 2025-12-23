import java.util.*;
class StringModify
{
	/*
	i/p: hi how are you?
	o/p: you? era how ih
	*/
	public static String reverse(String s){
		String rev="";
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			rev+=s.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[]args){
		String s="hi how are you? this is modify program from java";
		String [] a=s.split(" ");
		String ans="";
		for (int i=a.length-1;i>=0 ;i-- )
		{
			if(i%2==0){
				ans+=reverse(" "+a[i]);
			}else{
				ans+=a[i]+" ";
			}
		}
		System.out.println(ans);
	}
}
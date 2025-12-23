import java.util.*;
class Pangram
{
	public static boolean isPanagram(String s){
		s=s.toLowerCase();
		int count=0;
		for(char i='a';i<='z';i++){
			if(s.indexOf(i)!= -1){
				count++;
			}
		}
		return count==26;
	}
	public static void main(String[]args){
		String s="The quick brown fox jumps over the lazy dog";
		System.out.println(s);
		System.out.println(isPanagram(s)?"Panagram":"Not Panagram");
	}
}
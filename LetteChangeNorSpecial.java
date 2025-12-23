import java.util.Arrays;
class LetteChangeNorSpecial
{
	public static boolean isLetter(char c){
		return (c>='A' && c<='Z' || c>='a' && c<='z');
	}
	public static void main(String[]args){
		String s="hi @ how # you";
		char[]c=s.toCharArray();
		int left=0,right=c.length-1;
		while (left<right)
		{
			if(isLetter(c[left]) && isLetter(c[right])){
				char temp=c[left];
				c[left]=c[right];
				c[right]=temp;
				left++;
				right--;
			}
			if(!isLetter(c[left])){
				left++;
			}
			if(!isLetter(c[right])){
				right--;
			}
		}
		System.out.println(s);
		System.out.println(c);
	}
}
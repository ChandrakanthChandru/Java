import java.util.Arrays;
class RemoveDuplicate
{
	public static void frequency(String s){
		char[]a=s.toCharArray();
		Arrays.sort(a);
		int count=1;
		for(int i=0;i<a.length-1;i++){
			
			if(a[i]==a[i+1]){
				count++;
			}
			else{
				System.out.println(a[i]+":"+count);
				count=1;
			}
		}
		System.out.println(a[a.length-1]+":"+count);
	} 
	public static String removeDuplicate(String s){
		char[]a=s.toCharArray();
		String removed="";
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]==' '){
				continue;
			}
			for (int j=i+1;j<a.length ;j++ )
			{
				
				if(a[i]==a[j]){
					a[j]=' ';
				}
			}
			removed+=a[i];
			
		}
		return removed;
	}
	public static void main(String[]args){
		String s="banana";
		System.out.println("Befor Duplication \n"+s);
		frequency(s);
		String removed=removeDuplicate(s);
		System.out.println("After Removig Duplicates\n"+removed);
		frequency(removed);

		String num="10";
		String num2="24";
		int number=Integer.parseInt(num);
		int number2=Integer.parseInt(num2);
		System.out.println(number+number2);


	}
}
class LetterChange
{
	/*
	i/p:AmBDrS
	o/p:sEdbMa
	*/
	public static void main(String[]args){
		String s="AmBDrS";
		char[]a=s.toCharArray();
		int left=0,right=a.length-1;
		while (left<right)
		{
			if(a[left]>='A' && a[left]<='Z')
				a[left]+=32;
			else
				a[left]-=32;

			if(a[right]>='A' && a[right]<='Z')
				a[right]+=32;
			else
				a[right]-=32;

			char temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;

		}
		System.out.println(s);
		System.out.println(a);
	}
}
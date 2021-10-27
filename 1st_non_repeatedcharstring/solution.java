import java.util.*;
class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your String Here: ");
		String str = scan.next();
		int j = 0;
		char ch = str.charAt(j);
		for(int i=1 ; i<str.length() ; i++)
		{
			if((str.charAt(i))==ch)
			{
				j++;
				i=j+1;
				ch=str.charAt(j);
			}
		}
		System.out.println("first non repeated char in this string is:"+ch);
	}
}
/*
If two strings contain same set of characters but in 
different order then the two strings are called anagram.
*/
import java.util.*;
class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your 1st string here: ");
		String string1 = scan.next();
		System.out.println("Enter your 2nd string here: ");
		String string2 = scan.next();
		System.out.println("string 1 is: "+string1);
		System.out.println("string 2 is: "+string2);

		String res1 = distinct(string1);  //for getting distict charset of string.
		String res2 = distinct(string2);
		boolean bool = false;
		if(res1.length()>res2.length())
		{
			bool = anagram(res1,res2); //checking anagram
		}else
		{
			bool = anagram(res2,res1); //checking anagram
		}
		//System.out.println(res1); 
		//System.out.println(res2);

		

		System.out.println("Is this anagram? "+bool);
	}

	public static boolean anagram(String s1 , String s2)
	{
		boolean x = false;
		for(int i=0 ; i<s1.length() ;i++)
		{
			int flag=0;
			for(int j=0 ; j<s2.length() ;j++)
			{
					if(s1.charAt(i)==s1.charAt(j))
					{
						flag = 1;
						j=s2.length();
					}
			}
			if(flag==1)
			{
				x=true;
			}else
			{
				x=false;
				return x;
			}	
		}
		return x;
	}

	public static String distinct(String str)
	{
		String string = "";
		for(int i=0 ; i<str.length() ;i++)
		{
			char ch = str.charAt(i);
			int flag=0;
			for(int j=i-1 ; j>=0 ;j--)
			{
				if(ch==str.charAt(j))
				{
					flag=1;
					j=-1;
				}
			}
			if(flag==0)
			{
				string = string + ch;	
			}	
		}
		return string;		
	}
}
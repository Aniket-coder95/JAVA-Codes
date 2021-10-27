
import java.util.Scanner;
import java.util.*;
class test
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		boolean bool = isPalindrome(str);
		if(bool==true)
		{
			System.out.println("this is palindrome");
		}else
		{
			System.out.println("this is not a palindrome");
		}

	}
	public static boolean isPalindrome(String s)
	{
		String reverse = reverse(s);
		if(s.equals(reverse))
		{
			return true;
		}else
		{
			return false;
		}
	}

	public static String reverse(String s1)
	{
		if( s1.equals(null) || s1.isEmpty() )
		{
			return s1;
		}else
		{
			return (s1.charAt(s1.length()-1) + reverse(s1.substring(0,(s1.length()-1))) );
		}
	}
}
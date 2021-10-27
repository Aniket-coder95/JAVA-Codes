import java.util.*;
class solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your String:");
        String str = scan.next();
        String res = reverse(str);
        System.out.printf("Reversed string is: %s",res);
        System.out.println();
    }
    public static String reverse(String str)
    {
    	String string = "";
    	int len=str.length();
    	for(int i=len-1 ; i>=0 ; i--)
    	{
    		string = string + str.charAt(i);
    	}
    	return string;
    }
}